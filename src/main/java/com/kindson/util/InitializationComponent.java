package com.kindson.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kindson.model.Product;
import com.kindson.repository.ProductRepository;

@Component
public class InitializationComponent {

	@Autowired
	private ProductRepository productRepository;
	
	@PostConstruct
	public void inintProducts() {
		productRepository.deleteAll();
		Product product=new Product();
        product.setName("Kamsung D3");
        product.setCode("KAMSUNG-TRIOS");
        product.setTitle("Kamsung Trios 12 inch ");
        product.setDescription("Kamsung Trios 12 Touch");
        product.setImageUrl("kamsung.jpg");
        product.setPrice(12000.00);
        productRepository.save(product);

        product=new Product();
        product.setName("Lokia Pomia");
        product.setCode("LOKIA-POMIA");
        product.setTitle("Lokia 12 inch" );
        product.setDescription("Lokia Pomia 10");
        product.setImageUrl("lokia.jpg");
        product.setPrice(9000.00);
        productRepository.save(product);
	}
}
