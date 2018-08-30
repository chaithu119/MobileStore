package com.mobilestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;
import com.mobilestore.repository.MobileStoreRepositoryInterface;

@Service

public class MobileStoreService implements MobileStoreServiceInterface{
	@Autowired
	private MobileStoreRepositoryInterface dao;
	
	@Transactional(transactionManager="hbtxmg",readOnly=false)
	
	public String customerDetailsRegister(Customer customer) {
	int i=dao.customerDetailsInsert(customer);
	
	if(i!=0)
		return i+"id inserted successfully";
	else 
	    return "Object not inserted sucecsfully";
		
	}

	@Override
	public int customergetlogin(String username, String password) {
		
		return dao.getLOginDetails(username, password);
		
	}
	@Transactional(transactionManager="hbtxmg",readOnly=false)
	@Override
	public String registerProductDetails(ProductDetails details) {
		
	int i=	dao.sendProductDetails(details);

		if(i!=0)
			return i+"id product inserted successfully";
		else 
		    return "product not inserted sucecsfully";
			
		}
	}
	
	


