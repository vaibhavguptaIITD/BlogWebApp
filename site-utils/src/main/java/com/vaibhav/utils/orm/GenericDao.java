package com.vaibhav.utils.orm;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao <T extends Serializable> {
	
	/**
	 * Insert T into the database.
	 * 
	 * @param t
	 *            the persistable Object which needs to be created
	 */
	public T create(T t);

	/**
	 * Updates T.
	 * 
	 * @param t
	 *            the persistable object which needs to be updated
	 * 
	 * @return the updated object
	 */
	public T update(T t);

	/**
	 * Gets the object by primary key.
	 * 
	 * @param clas
	 *            the class of persistable object
	 * @param primaryKeyId
	 *            the primary key id
	 * 
	 * @return the t
	 */
	public T get(Class clas, Serializable primaryKeyId);

	/**
	 * Deletes the object by primary key and class.
	 * 
	 * @param clas
	 *            the class
	 * @param id
	 *            the id
	 */
	public void delete(Class clas, Serializable id);
	
	
	public List findByNamedQuery(final String queryName,
			final Map<String, String> params);

	
	public Object findObjectByNamedQuery(String queryName, String[] paramNames,
			Object... paramValues) ;
	
	public List findByNamedQuery(final String queryName);


}
