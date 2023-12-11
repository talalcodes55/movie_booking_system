package movies;

public class User {
	String userName;
	String status;
    String email;
	String password;
	Bank bankAccount;

	public User(String userName ,String email ,String password, int balance) {
		this.userName = userName;
		this.email=email;
		this.password=password;
		this.status = "viewer";
		this.bankAccount = new Bank(balance);
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
