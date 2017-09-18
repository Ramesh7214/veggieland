package com.veggieland.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veggieland.datasource.service.ItemService;
import com.veggieland.datastore.model.Items;

@RestController
@RequestMapping("/api")
public class ItemController {

	@Autowired
	public ItemService itemService;

	@RequestMapping("/items")
	public ResponseEntity<List<Items>> getItems() {
		List<Items> items = itemService.getItems();
		if (items.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Items>>(items, HttpStatus.OK);
	}

}
