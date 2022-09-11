/**
 * 
 */
package kumari.shweta.model;

/**
 * @author Shweta kumari
 *
 */
public class User {
	
	/* Form field name attribute value should be same has this model class member name */
	
	private String emailId;
	private String user;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", user=" + user + ", password=" + password + "]";
	}
	
	

}
