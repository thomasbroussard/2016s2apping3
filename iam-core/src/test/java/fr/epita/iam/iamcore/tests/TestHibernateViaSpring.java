/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.iamcore.datamodel.Identity;
import fr.epita.iamcore.services.dao.IdentityDAO;

/**
 * @author tbrou
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestHibernateViaSpring {
	
	@Inject
	DataSource ds;
	
	@Inject
	@Named("identityDAO")
	private IdentityDAO dao;
	
	
	@Test
	public void testDataSource(){
		Assert.assertNotNull(ds);
	}
	
	//@Test
	public void testConfiguration(){
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		dao.save(identity);
		
	}

}
