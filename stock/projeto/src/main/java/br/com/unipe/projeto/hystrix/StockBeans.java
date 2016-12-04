package br.com.unipe.projeto.hystrix;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.unipe.project.feign.ProductClient;
import br.com.unipe.projeto.domain.Product;

@Component
public class StockBeans {
	
	private ProductClient productClient;
	
	@HystrixCommand(fallbackMethod = "cacheProducts")
	public List<Product> getProducts(String id){
		return productClient.getProducts(id);
	}

	public List<Product> cacheProducts(String id){
		return Arrays.asList(new Product(1, "Product Cache",Arrays.asList("123", "Bread", "Brains")));
	}
}
