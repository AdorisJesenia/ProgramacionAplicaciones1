/**
 * 
 */
package mx.edu.utng.asociacion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jessy
 *
 */
public class AddressBook {
	private String nombre;
	
	private List<Contact>contacts;
	private List<ContactGroup> contactGroups;
	public AddressBook(){
		this.contacts = new ArrayList<Contact>();
		this.contactGroups = new ArrayList<ContactGroup>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
