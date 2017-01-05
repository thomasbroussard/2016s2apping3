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
public class IdentityWebServiceImpl implements IdentityWebservice {

	@WebMethod
	@Override
	public int countIdentities() {
		return 10;
	}

}
