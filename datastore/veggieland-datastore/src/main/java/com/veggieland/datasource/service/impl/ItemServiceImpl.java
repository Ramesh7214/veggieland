package com.veggieland.datasource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veggieland.datasource.dao.ItemDao;
import com.veggieland.datasource.service.ItemService;
import com.veggieland.datastore.model.Items;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	public ItemDao itemDao;

	@Override
	public List<Items> getItems() {
		// TODO Auto-generated method stub
		return itemDao.getItems();
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
