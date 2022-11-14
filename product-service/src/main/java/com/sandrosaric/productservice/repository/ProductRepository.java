package com.sandrosaric.productservice.repository;

import com.sandrosaric.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
