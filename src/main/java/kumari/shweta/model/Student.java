package kumari.shweta.model;

import java.util.Date;
public class Student {
	private String username;
	private Long userid;
    private  Address address;
    private Date dob;
    public boolean validationError;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isValidationError() {
		return validationError;
	}
	public void setValidationError(boolean validationError) {
		this.validationError = validationError;
	}
	
	

}
