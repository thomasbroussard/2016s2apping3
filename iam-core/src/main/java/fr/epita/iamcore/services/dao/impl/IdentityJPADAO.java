/**
 * 
 */
package fr.epita.iamcore.services.dao.impl;

import java.util.Collection;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.epita.iamcore.datamodel.Identity;
import fr.epita.iamcore.services.dao.IdentityDAO;

/**
 * @author tbrou
 *
 */
public class IdentityJPADAO implements IdentityDAO {
	
	@Inject
	SessionFactory sf;

	/* (non-Javadoc)
	 * @see fr.epita.iamcore.services.dao.DAO#save(java.lang.Object)
	 */
	public void save(Identity id) {
		Session session = sf.openSession();
		session.save(id);
		session.close();

	}

	/* (non-Javadoc)
	 * @see fr.epita.iamcore.services.dao.DAO#update(java.lang.Object)
	 */
	public void update(Identity id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.epita.iamcore.services.dao.DAO#delete(java.lang.Object)
	 */
	public void delete(Identity id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.epita.iamcore.services.dao.DAO#getById(java.lang.Object)
	 */
	public Identity getById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.epita.iamcore.services.dao.DAO#search(java.lang.Object)
	 */
	public Collection<Identity> search(Identity criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
