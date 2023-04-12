package com.pixeltrice.elasticapp;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "products")
public class Product {

	@Field(type = FieldType.Text, name = "description")
	private String description;

	@Id
	private String id;

	@Field(type = FieldType.Text, name = "name")
	private String name;

	@Field(type = FieldType.Double, name = "price")
	private double price;

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	public String getId() {
		return id;
	}

	// Getter and Setter
}