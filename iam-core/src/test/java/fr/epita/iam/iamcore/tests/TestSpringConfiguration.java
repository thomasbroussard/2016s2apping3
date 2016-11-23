/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.iam.iamlog.IamLogManager;
import fr.epita.iam.iamlog.IamLogger;
import fr.epita.iamcore.datamodel.Identity;

/**
 * @author tbrou
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestSpringConfiguration {
	
	private IamLogger logger = IamLogManager.getIamLogger(TestSpringConfiguration.class);
	
	@Autowired
	@Qualifier("identitySample")
	private Identity identity;
	
	@Test
	public void TestSpring(){
		Assert.assertNotNull(identity);
		Assert.assertEquals("Thomas Broussard", identity.getDisplayName());
		logger.debug("valeur du displayName : {}", identity.getDisplayName());
	}

	
	
}
