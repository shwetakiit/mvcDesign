
package kumari.shweta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shweta kumari
 *
 */
@Entity
@Table(name = "EMPLOYEE_INFO")
public class EmployeeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emplpyeeId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "CITY")
	private String jobLocation;

	@Column(name = "ENCRYPTED_PASSWORD")
	private String password;

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(Integer emplpyeeId, String name, String emailId, String jobLocation, String password) {

		this.emplpyeeId = emplpyeeId;
		this.name = name;
		this.emailId = emailId;
		this.jobLocation = jobLocation;
		this.password = password;
	}

	public Integer getEmplpyeeId() {
		return emplpyeeId;
	}

	public void setEmplpyeeId(Integer emplpyeeId) {
		this.emplpyeeId = emplpyeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [emplpyeeId=" + emplpyeeId + ", name=" + name + ", emailId=" + emailId + ", jobLocation="
				+ jobLocation + "]";
	}

}
