package br.com.unipe.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unipe.projeto.domain.Stock;
import br.com.unipe.projeto.domain.StockWithProduct;
import br.com.unipe.projeto.hystrix.StockBeans;

@RestController
public class StockController {
	
	@Autowired
	private StockBeans stockBeans;
	
	private static List<Stock> stocks = new ArrayList<Stock>();
	
	public StockController(){
		stocks.add(new Stock("1","Stock 1", "St Saint Jonh"));
		stocks.add(new Stock("2","Stock 2", "St Saint Augustin"));
	}
	
	@RequestMapping("/")
	public List<Stock> geStocks(){
		return stocks;
	}
	
	@RequestMapping("/products")
	public List<StockWithProduct> getProductStockWithProducts(){
		
		List<StockWithProduct> returnStock = new ArrayList<StockWithProduct>();
		
		for(Stock stock : stocks){
			returnStock.add(new StockWithProduct(stock, stockBeans.getProducts(stock.getId())));
		}
		return returnStock;
	}
}
