/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
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
	
	@After
	public void tearDown(){
		sf.close();
	}

	@Test
	public void testSessionFactory() throws SQLException{
		
		//Given = Hypoth�se
		Session session = sf.openSession();
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		
		//When = action � tester
		session.save(identity);
		
		//Then = V�rification que l'action s'est bien produite
		Connection connection = ds.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from IDENTITIES");
		ResultSet rs = pstmt.executeQuery();
		Assert.assertEquals(1,rs.getFetchSize());
		rs.next();
		String fetchedDisplayName = rs.getString("displayName");
		Assert.assertEquals("Thomas",fetchedDisplayName);
		LOGGER.info("fetched displayName : {}", fetchedDisplayName);
		
		pstmt.close();
		connection.close();
		session.close();
	
	}
	
	//@Test
	public void testConfiguration(){
		Identity identity = new Identity();
		identity.setDisplayName("Thomas");
		dao.save(identity);
		
	}

}
