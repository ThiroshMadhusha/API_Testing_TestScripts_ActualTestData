package api.endPoints;

import api.payLoad.User;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class userEndPoints {
	
	public static Response createUser(User payload) {
		
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(payload)
		
		.when()
		.post(Routes.user_post_url);
		
		return response;
	}
	
	public static Response getUser(String userName) {
		
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
		
		.when()
		.get(Routes.user_get_url);
		
		return response;
	}
	
	public static Response updateUser(String userName, User payload) {
		
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
				.body(payload)
		
		.when()
		.put(Routes.user_put_url);
		
		return response;
	}
	
	public static Response deleteUser(String userName) {
		
		Response response = given()
				.accept(ContentType.JSON)
				.pathParam("username", userName)
		
		.when()
		.delete(Routes.user_delete_url);
		
		return response;
	}

}
