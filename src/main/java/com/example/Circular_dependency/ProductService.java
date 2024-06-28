package com.example.Circular_dependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private CustomerService customerService;

    public ProductService() {}

    public void setCustomerService( CustomerService customerService){
        this.customerService = customerService;
    }

}
