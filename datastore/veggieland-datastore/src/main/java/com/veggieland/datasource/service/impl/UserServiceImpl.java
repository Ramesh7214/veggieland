package com.veggieland.datasource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veggieland.datasource.dao.UserDao;
import com.veggieland.datasource.service.UserService;
import com.veggieland.datastore.model.User;

/**
 * @author Ramesh Gadenaboina
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public Long createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public String updateUser(User user) {
			return userDao.updateUser(user);
	}
}
