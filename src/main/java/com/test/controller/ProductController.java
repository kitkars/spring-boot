package com.test.controller;


import com.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public void save(){
        this.productService.create(null);
    }

    @GetMapping("/count")
    public long get(){
        return this.productService.getCount();
    }

}
