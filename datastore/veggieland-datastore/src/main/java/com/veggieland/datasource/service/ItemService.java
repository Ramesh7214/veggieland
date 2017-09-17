package com.veggieland.datasource.service;

import java.util.List;

import com.veggieland.datastore.model.Items;

public interface ItemService {

	public List<Items> getItems();

	public List<Items> getItemsByCategory(String category);

	public List<Items> getItemsByTag(String tag);

	public List<Items> getItemsByPrice(Double price);

}
