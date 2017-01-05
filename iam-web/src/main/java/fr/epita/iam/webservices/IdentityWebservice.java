/**
 * 
 */
package fr.epita.iam.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author tbrou
 *
 */

@WebService
public interface IdentityWebservice {
	
	@WebMethod
	public int countIdentities();

}
