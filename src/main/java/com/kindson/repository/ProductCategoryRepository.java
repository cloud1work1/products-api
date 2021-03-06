package com.kindson.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kindson.model.ProductCategory;

@RepositoryRestResource(collectionResourceRel="categories", path="categories")
public interface ProductCategoryRepository extends MongoRepository<ProductCategory,String>{

}
