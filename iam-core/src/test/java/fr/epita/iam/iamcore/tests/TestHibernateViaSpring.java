/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
public class TestHibernateViaSpring {
	
	@Inject
	DataSource ds;
	
	@Inject
	SessionFactory sf;
	
	
	@Inject
	@Named("identityDAO")
	private IdentityDAO dao;
	
	private static final IamLogger LOGGER = IamLogManager.getIamLogger(TestHibernateViaSpring.class);
	
	
	@Test
	public void testDataSource() throws SQLException{
		Assert.assertNotNull(ds);
		LOGGER.info(ds.getConnection().getSchema());
	}

	@Test
	public void testSessionFactory() throws SQLException{
		Session session = sf.openSession();
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		session.save(identity);
		
		//Comment s'assurer que l'objet est bien passé en base?
	}
	
	//@Test
	public void testConfiguration(){
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		dao.save(identity);
		
	}

}
