package com.veggieland.datasource.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.veggieland.datasource.common.GenericDao;
import com.veggieland.datasource.dao.ItemDao;
import com.veggieland.datastore.model.Items;

@Repository
public class ItemDaoImpl extends GenericDao implements ItemDao {

	@Override
	@Transactional
	public List<Items> getItems() {
		
		CriteriaQuery criteria = getCurrentSession().getCriteriaBuilder().createQuery(Items.class);
		criteria.from(Items.class);
		return getCurrentSession().createQuery(criteria).getResultList();
	}

	@Override
	public List<Items> getItemsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getItemsByTag(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getItemsByPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
