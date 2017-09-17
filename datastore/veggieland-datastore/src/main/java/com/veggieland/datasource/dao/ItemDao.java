package com.veggieland.datasource.dao;

import java.util.List;

import com.veggieland.datastore.model.Items;

public interface ItemDao {

	public List<Items> getItems();

	public List<Items> getItemsByCategory(String category);

	public List<Items> getItemsByTag(String tag);

	public List<Items> getItemsByPrice(Double price);

}
