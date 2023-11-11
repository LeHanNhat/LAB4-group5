package USERS;

public class User {
	private String user_Id;

	private String first_Name;

	private String last_Name;

	private String Email;

	private String passWord;
	 public User(String user_Id, String first_Name, String last_Name, String email, String password) {
	        this.user_Id = user_Id;
	        this.first_Name = first_Name;
	        this.last_Name = last_Name;
	        this.Email = email;
	        this.passWord = password;
	    }
	public User() {
		
	}
	void register() {

	}

	void login() {

	}

	void resetPassWord() {

	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
