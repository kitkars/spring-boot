package com.test.service;

import com.test.entity.Product;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void create(Product product){
        Product p = this.productRepository.save(product);
        System.out.println(p);
    }

    public long getCount(){
        return this.productRepository.count();
    }


}
