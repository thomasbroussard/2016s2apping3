/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;

import fr.epita.iamcore.datamodel.Identity;
import fr.epita.iamcore.services.dao.IdentityDAO;

/**
 * @author tbrou
 *
 */
public class TestHibernateViaSpring {
	
	@Inject
	@Named("identityDAO")
	private IdentityDAO dao;
	
	@Test
	public void testConfiguration(){
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		dao.save(identity);
		
	}

}
