package com.kindson.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kindson.model.Product;

@RepositoryRestResource(collectionResourceRel="productData", path="productData")
public interface ProductRepository extends MongoRepository<Product,String> {

}
