package api.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoints.userEndPoints;
import api.payLoad.User;
import io.restassured.response.Response;

public class UserTest_SingleRealData {
	
	@Test(priority=1, dataProvider = "userNameData")
	public void newCreateUser(String UserNames) {
		
		User userPayload = new User();
		Faker faker = new Faker();
		userPayload = new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(UserNames);
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		userPayload.setPassword(faker.internet().password(4, 8));
		userPayload.setUserSatus(faker.number().hashCode());
		
		Response response = userEndPoints.createUser(userPayload);
		System.out.println("Create USer Data Successful!");
		//log response
		response.then().log().all();
		
		//validation
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	/**
	 * Add One Single Data Provider
	 * @return
	 */
	@DataProvider(name="userNameData")
	public String[] userNameData() {
		
		String[] userNames = {"thirosh", "madhusha", "pasan", "sayu", "nirosha"};
	    return userNames;
	}
	

}
