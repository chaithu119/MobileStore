package com.mobilestore.service;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;

public interface MobileStoreServiceInterface {


	 int customergetlogin(String username, String password);
	public String customerDetailsRegister(Customer customer);
	public String registerProductDetails(ProductDetails details);
}