package com.example.productcustomer.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.productcustomer.ResponseDto;
import com.example.productcustomer.model.Customer;
import com.example.productcustomer.model.Product;
import com.example.productcustomer.repository.CustomerRepo;
import com.example.productcustomer.repository.ProductRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;
    
    public ResponseDto responseDto(int status, String message, Object data) {
    	ResponseDto rd = new ResponseDto();
    	rd.setStatusCode(status);
    	rd.setMessage(message);
    	rd.setData(data);
    	return rd;
    }

    @Override
    public ResponseDto getAllCustomers() {
		List<Customer> all = customerRepo.findAll();
		if(ObjectUtils.isEmpty(all)) {
  			return responseDto(200, "Data fetched successfully", all);
		}else {
			return responseDto(404, "Data not found", "No data available");
		}
    }

    @Override
    public ResponseDto getAllProducts() {
    	List<Product> all = productRepo.findAll();
		if(all != null) {
  			return responseDto(200, "Data fetched successfully", all);
		}else {
			return responseDto(404, "Data not found", "No data available");
		}
    }

    @Override
    public ResponseDto addCustomer(Customer customer) {
    	try {
    		return responseDto(200, "Data saved successfully", customerRepo.save(customer));
    	}catch(Exception e) {
    		return responseDto(400, "Bad Request", e.getMessage());
    	}
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Customer productsToCustomer(int cId, int... pId) {

        Customer customer = customerRepo.findById(cId).get();
        List<Product> products = new ArrayList<>();

        for(int i: pId){
        	Product product = productRepo.findById(i).get();
        	if(product.getCustomer1() == null) {        		
        		product.setCustomer1(customer);
        		products.add(product);
        	}
        }

        customer.setProducts(products);
        return customerRepo.save(customer);
    }

	@Override
	public String customerByProduct(String prod_name) {
		return productRepo.findByProductNameContaining(prod_name);
	}
    
}
