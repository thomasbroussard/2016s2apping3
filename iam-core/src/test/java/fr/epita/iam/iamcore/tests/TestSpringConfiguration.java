/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.iam.iamlog.IamLogManager;
import fr.epita.iam.iamlog.IamLogger;
import fr.epita.iamcore.datamodel.Identity;
import fr.epita.iamcore.services.dao.IdentityDAO;

/**
 * @author tbrou
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestSpringConfiguration {
	
	private IamLogger logger = IamLogManager.getIamLogger(TestSpringConfiguration.class);
	
	@Inject
//	@Qualifier("identitySample")
	private Identity identity;
	
	@Inject
	private IdentityDAO dao;
	
	@Test
	public void TestSpring(){
		Assert.assertNotNull(identity);
		Assert.assertEquals("Thomas Broussard", identity.getDisplayName());
		logger.debug("valeur du displayName : {}", identity.getDisplayName());
	}

	
	@Test
	public void TestDAOViaSpring(){
		Assert.assertNotNull(dao);
	}
	
	
	
	
}
