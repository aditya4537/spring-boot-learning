package com.example.productcustomer.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.productcustomer.ResponseDto;
import com.example.productcustomer.model.Customer;
import com.example.productcustomer.model.Product;
import com.example.productcustomer.service.CustomerService;


@RestController
public class MainController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public ResponseEntity<ResponseDto> displayAllCustomer(){
    	ResponseDto allCustomers = customerService.getAllCustomers();
        return new ResponseEntity<ResponseDto>(allCustomers, HttpStatusCode.valueOf(allCustomers.getStatusCode()));
    }

    @GetMapping("/getProducts")
    public ResponseEntity<ResponseDto> displayAllProducts(){
    	ResponseDto allProducts = customerService.getAllProducts();
        return new ResponseEntity<ResponseDto>(allProducts, HttpStatusCode.valueOf(allProducts.getStatusCode()));
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<ResponseDto> addCustomer(@RequestBody Customer customer) {
    	ResponseDto customer2 = customerService.addCustomer(customer); 
        return new ResponseEntity<ResponseDto>(customer2, HttpStatusCode.valueOf(customer2.getStatusCode()));
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return customerService.addProduct(product);
    }
    
    @PutMapping("/productsToCustomer")
    public Customer prodToCust(@RequestParam("cId") int cId, @RequestParam("pId") int... pId){
        return customerService.productsToCustomer(cId, pId);
    }
    
    @GetMapping("/customerByProduct")
    public String getCustomerByProduct(@RequestParam("pName") String prod_name) {
        return customerService.customerByProduct(prod_name);
    }
    
}
