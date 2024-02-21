package com.example.productcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.productcustomer.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	@Query(value="SELECT c.customer_name \r\n"
//			+ "FROM customer as c\r\n"
//			+ "INNER JOIN product as p\r\n"
//			+ "ON c.customer_id = p.customer1_customer_id\r\n"
//			+ "WHERE p.product_name = ?1",
//			nativeQuery = true)
//	public String findCustomerByProductName(String prod_name);
	
	public String findByProductNameContaining(String pName);
}
