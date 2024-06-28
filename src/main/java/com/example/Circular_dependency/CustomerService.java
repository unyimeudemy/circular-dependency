package com.example.Circular_dependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private ProductService productService;

    public CustomerService() {}

    public void setProductService(ProductService productService){
        this.productService = productService;
    }
}