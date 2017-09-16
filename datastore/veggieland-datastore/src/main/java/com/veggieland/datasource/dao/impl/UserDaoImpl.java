package com.veggieland.datasource.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.veggieland.datasource.dao.UserDao;
import com.veggieland.datastore.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public int createUser(User user) {
		return (int) sessionFactory.getCurrentSession().save(user);
	}
}
