package com.veggieland.datasource.dao;

import com.veggieland.datastore.model.User;

/**
 * @author Ramesh Gadenaboina
 *
 */
public interface UserDao {
	
	public Long createUser(User user);
	
	public String updateUser(User user);

}
