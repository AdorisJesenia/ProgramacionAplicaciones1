/**
 * 
 */
package mx.edu.utng.asociacion;

import java.util.List;

/**
 * @author Jessy
 *
 */
public class ContactGroup {
	private String name;
	private List<ContactGroup>contactGroups;
	private List<Contact>contacts;
	
	public ContactGroup(List<ContactGroup> contactGroups){
		this.contactGroups = contactGroups;
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
