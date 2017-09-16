package com.veggieland.datasource.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.veggieland.datasource.common.GenericDao;
import com.veggieland.datasource.dao.UserDao;
import com.veggieland.datasource.exceptions.VeggieDataException;
import com.veggieland.datastore.model.User;

/**
 * @author Ramesh Gadenaboina
 *
 */
@Repository
public class UserDaoImpl extends GenericDao implements UserDao {

	@Transactional
	public Long createUser(User user) {
		return (Long) getCurrentSession().save(user);
	}

	@Override
	public Long updateUser(User user) throws VeggieDataException {
		try {
			getCurrentSession().update(user);
		} catch (Exception e) {
			// need to be logged
			throw new VeggieDataException("unable to udpate User Id :" + user.getId());
		}

		return null;

	}
}
