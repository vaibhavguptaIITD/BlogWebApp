package com.vaibhav.utils.orm;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.springframework.orm.jpa.support.JpaDaoSupport;

public class GenericDaoImpl<T extends Serializable> extends JpaDaoSupport implements GenericDao<T> {

	@Override
	public T create(T t) {
		getJpaTemplate().persist(t);
		return t;
	}

	@Override
	public void delete(Class clas, Serializable id) {
		getJpaTemplate().remove(get(clas, id));
		
	}

	@Override
	public List findByNamedQuery(final String queryName, final Map<String, String> params) {
		
		return this.getJpaTemplate().findByNamedQueryAndNamedParams(queryName,
				params);
	}
	
	public List findByNamedQuery(final String queryName)
	{
		return this.getJpaTemplate().findByNamedQuery(queryName);
	}

	@Override
	public Object findObjectByNamedQuery(String queryName, String[] paramNames,
			Object... paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(Class clas, Serializable id) {
		return (T) getJpaTemplate().find(clas, id);
	}


	@Override
	public T update(T t) {
		// TODO Auto-generated method stub
		return getJpaTemplate().merge(t);
	}
	
	

}
