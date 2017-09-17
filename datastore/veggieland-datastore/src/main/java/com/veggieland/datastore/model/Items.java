package com.veggieland.datastore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "ITEM")
public class Items {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "item_sequence")
	@SequenceGenerator(name="item_sequence", sequenceName = "ITEMSEQUENCE", allocationSize = 1)
	private Long id;
	
	@Column
	private String name;
	
	@Column (name = "LOCAL_NAME")
	private String localName;
	
	@Column
	private String description;
	
	@Column
	private String category;
	
	@Column
	private Double price;
	
	@Column
	private String grade;
	
	@Column
	private String tag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
