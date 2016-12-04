package br.com.unipe.projeto.domain;

import java.util.List;

public class Product {
	
	private int id;
	private String name;
	private List<String> stock;

	
	public Product() {
		
	}

	public Product(int id, String name, List<String> stock) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getStock() {
		return stock;
	}

	public void setStock(List<String> stock) {
		this.stock = stock;
	}
}