package com.veggieland.datasource.dao;

import com.veggieland.datasource.exceptions.VeggieDataException;
import com.veggieland.datastore.model.User;

/**
 * @author Ramesh Gadenaboina
 *
 */
public interface UserDao {
	
	public Long createUser(User user);
	
	public Long updateUser(User user) throws VeggieDataException;

}
