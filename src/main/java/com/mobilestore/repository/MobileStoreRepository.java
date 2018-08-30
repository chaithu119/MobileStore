package com.mobilestore.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;

@Repository
public class MobileStoreRepository implements MobileStoreRepositoryInterface{
	
	private String hql="select count(*) from Customer m where m.email=? and m.password=?";
	@Autowired
	private HibernateTemplate ht;
	
	
	public int customerDetailsInsert(Customer customer) {
    int i=(int) ht.save(customer);
	return i;
	
	}
JdbcTemplate jt;

	@Override
	public int getLOginDetails(String username, String password) {
		
		
    @SuppressWarnings("unchecked")
	List<Long> list=  (List<Long>) ht.find(hql, username,password);
		
   
		long count=list.get(0);
		//System.out.println(count);
		return (int)count;
	}
	
	
	public int setProductDetails(ProductDetails pdetails) {
		
		int i=(int)ht.save(pdetails);
		
		
		return 0;
		
	}


	@Override
	public int sendProductDetails(ProductDetails details) {
		int i=(int)ht.save(details);
		return i;
	}
	

}
