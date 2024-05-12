package api.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoints.userEndPoints;
import api.payLoad.User;
import io.restassured.response.Response;

public class UserTest_FakePluginData {
	
	//use fakedata generator
	Faker faker;
	User userPayload;
	@BeforeClass
	public void generateTestData() {
		
		faker = new Faker();
		userPayload = new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		userPayload.setPassword(faker.internet().password(4, 8));
		userPayload.setUserSatus(faker.number().hashCode());
	}

	@Test(priority=1)
	public void newCreateUser() {
		
		Response response = userEndPoints.createUser(userPayload);
		System.out.println("Create USer Data Successful!");
		//log response
		response.then().log().all();
		
		//validation
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2)
	public void getUserData() {
		
		Response response = userEndPoints.getUser(this.userPayload.getUsername());
		System.out.println("Read USer Data Successful!");
		//log response
		response.then().log().all();
		
		//validation
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=3)
	public void updateUserData() {
		
		userPayload.setFirstName(faker.name().firstName());
		Response response = userEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
		System.out.println("Update USer Data Successful!");
		//log response
		response.then().log().all();
		
		//validation
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=4)
	public void deleteUserData() {
		
		Response response = userEndPoints.deleteUser(this.userPayload.getUsername());
		System.out.println("Delete USer Data Successful!");
		//log response
		response.then().log().all();
		
		//validation
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
}
