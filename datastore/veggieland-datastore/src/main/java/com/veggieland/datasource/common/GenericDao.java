package com.veggieland.datasource.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ramesh Gadenaboina
 * GenericDao which holds SessionFactory
 *
 */
public class GenericDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * returns the current Session
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/*
	 * opens the new Session
	 */
	public Session getSession() {
		return sessionFactory.openSession();
	}

}
