package com.veggieland.datasource.service;

import com.veggieland.datastore.model.User;

/**
 * @author Ramesh Gadenaboina
 *
 */
public interface UserService {
	
	public Long createUser(User user);
	
	public Long updateUser(User user);

}
