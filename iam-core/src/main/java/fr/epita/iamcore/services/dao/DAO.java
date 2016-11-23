/**
 * 
 */
package fr.epita.iamcore.services.dao;

import java.util.Collection;

/**
 * @author tbrou
 *
 */
public interface DAO<T> {
	
	
	void save(T id);
	void update(T id); 
	void delete(T id);
	T getById(Object id);
	Collection<T> search(T criteria);
}
