package br.com.unipe.project.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.unipe.projeto.domain.Product;

@FeignClient("products")
public interface ProductClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/product/{id}" )
	List<Product> getProducts(@PathVariable("id") String id);
}
