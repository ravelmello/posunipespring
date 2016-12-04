package br.com.unipe.projeto.domain;

import java.util.List;

public class StockWithProduct extends Stock {
	
	private List<Product> products;
	
	public StockWithProduct(Stock stock, List<Product> products){
		super(stock.getId(), stock.getName(), stock.getAddress());
		this.products = products;
	}
	
	public List<Product> getProducts(){
		return products;
	}

	public void setProducts(List<Product> products){
		this.products = products;
	}
}
