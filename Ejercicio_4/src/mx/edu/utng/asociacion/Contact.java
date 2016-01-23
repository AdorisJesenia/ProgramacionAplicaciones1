/**
 * 
 */
package mx.edu.utng.asociacion;

/**
 * @author Jessy
 *
 */
public class Contact {
	private String name;
	private String primaryContactMethod;
	private String emailAddress;
	private String faxNumber;
	
	public String getName(){
		return name;
		
	}

	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}

	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setName(String name) {
		this.name = name;
	}


}
