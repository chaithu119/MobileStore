package com.mobilestore.repository;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;

public interface MobileStoreRepositoryInterface {

	
	int customerDetailsInsert(Customer customer);
	public  int getLOginDetails(String username,String password);
	
	public int sendProductDetails(ProductDetails details);
}
