/**
 * 
 */
package fr.epita.iam.web.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author tbrou
 *
 */
@ManagedBean
@RequestScoped
public class IndexPageForm {
	
	private String name;
	private String message;

	

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	
	public String next() {
		
		return "page";
	}

	/**
	 * @return the message
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public final void setMessage(String message) {
		this.message = message;
	}
	

}
