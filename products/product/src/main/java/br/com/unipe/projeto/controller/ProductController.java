package br.com.unipe.projeto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import br.com.unipe.projeto.domain.Product;

@RestController
public class ProductController {
	
	private List<Product> products = new ArrayList<Product>();
	
	public ProductController(){
		products.add(new Product(1, "Assassins Creed Revelations", Arrays.asList("1234")));
		products.add(new Product(2, "Assassins Creed Unity", Arrays.asList("123")));
	}
	
	@RequestMapping("/")
	public List<Product> getProducts() {
		return this.products;
	}
}
