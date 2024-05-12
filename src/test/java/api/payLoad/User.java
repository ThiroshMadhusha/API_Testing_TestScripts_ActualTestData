package api.payLoad;

public class User {
	
	//payload:(User Data):
	/**
	 * "id": 0,
	 * "username": "string",
	 * "firstName": "string",
	 * "lastName": "string",
	 * "email": "string",
	 * "password": "string",
	 * "phone": "string",
	 * "userStatus": 0
	 */
	
	//Create variables
	int id;
	String username;
	String firstName;
	String lastName;
	String email;
	String password;
	String phone;
	int userSatus;
	
	//create get and setters
	//get --> read values
	//set --> in variable values set
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserSatus() {
		return userSatus;
	}
	public void setUserSatus(int userSatus) {
		this.userSatus = userSatus;
	}

	
	

}
