package com.example.productcustomer.service;

import com.example.productcustomer.ResponseDto;
import com.example.productcustomer.model.Customer;
import com.example.productcustomer.model.Product;

public interface CustomerService {
    
    public ResponseDto getAllCustomers();

    public ResponseDto getAllProducts();

    public ResponseDto addCustomer(Customer customer);

    public Product addProduct(Product product);

    public Customer productsToCustomer(int cId, int... pId);
    
    public String customerByProduct(String name);
}
