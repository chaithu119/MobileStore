package com.mobilestore.aop;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MobileStoreAop {
     @Autowired
	@Qualifier("sessfactory")
	private SessionFactory sessionFactory;
	
	
	@Bean("hbtxmg")
	public HibernateTransactionManager gettxmanager(){
		
		return new HibernateTransactionManager(sessionFactory);
	}
	
	
	
}
