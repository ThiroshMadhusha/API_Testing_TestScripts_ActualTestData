package api.endPoints;

/**
 * Create User --> POST --> https://petstore.swagger.io/v2/user
 * Get User --> GET --> https://petstore.swagger.io/v2/user{username} 
 * PUT User --> PUT --> https://petstore.swagger.io/v2/user{username}
 * DELETE USer --> DELETE --> https://petstore.swagger.io/v2/user{username}
 */

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";
	
	//user modules URLs
	public static String user_post_url = base_url + "/user";
	public static String user_get_url = base_url + "/user/{username}";
	public static String user_put_url = base_url + "/user/{username}";
	public static String user_delete_url = base_url + "/user/{username}";
	
	//pet modules URLs
	public static String pet_post_url = base_url + "/pet";
	public static String pet_get_url = base_url + "/pet/{petId}";
	public static String pet_put_url = base_url + "/pet";
	public static String pet_delete_url = base_url + "/pet/{petId}";

	//store modules URLs
	
	

}
