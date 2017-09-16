package com.veggieland.datasource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veggieland.datasource.dao.UserDao;
import com.veggieland.datasource.service.UserService;
import com.veggieland.datastore.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public int createUser(User user) {
		return userDao.createUser(user);
	}

}
