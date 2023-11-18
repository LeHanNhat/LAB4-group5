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

	public User(String user_Id, String password) {
		this.user_Id = user_Id;
		this.passWord = password;
		login(user_Id, password);
	}
	// public void register(String user_Id) {
	// // kiểm tra user id đã có chưa => need database
	// // dùng try catch
	// // nếu có thông báo đã có và hỏi người dùng có muốn tạo  mới không hoặc ngư
	//  dùng quên mk
	// // nếu không sẽ 
	// }

	private void login(String user_Id, String password) {
		// kiểm tra thông tin login => need database
		// Dùng try
		// tạo connection
		// kiểm tra thông tin
		// lấy thông tin về 
		// this.user_Id = user_Id;
		// this.first_Name = first_Name;
		// this.last_Name = last_Name;
		// this.Email = email;
		// this.passWord = password;
	}

	public void resetPassWord(String user_Id) {
		boolean checkUserID = false;
		// B1: kiem tra userID đã có chưa
		try {
			// tạo kết nối tới db
			// if (check userID có trong database)
			// checkUserID = true;
		} catch (Exception e) {
			// đưa ra lỗi nếu kết nối có vấn đề
		}
		// 1 đã có => hỏi mk mới lưu vào => nhập lại mk mới
		// if checkUserId == true
		// String newPass;
		// system.out.println("Enter your new password"):
		// newPass = sc.next();
		// System.out.println("Enter your new password again")
		// If (newPass.equal(sc.next()))
		try {
			// tạo connect
			// thực hiện update pass trong db
		} catch (Exception e) {
			// đưa ra lỗi nếu kết nối có vấn đề
		}
	}

	// public String getUser_Id() {
	// return user_Id;
	// }

	// public void setUser_Id(String user_Id) {
	// this.user_Id = user_Id;
	// }
	// get set UserId không cần thiết userID sẽ dùng như primary key trong db nên k
	// ông được phép sửa

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

// các hàm get set sẽ dùng dữ liệu lấy về thông qua hàm login 
// hàm login sẽ thông báo thành công và lấy dữ liệu lưu vào các var
// 