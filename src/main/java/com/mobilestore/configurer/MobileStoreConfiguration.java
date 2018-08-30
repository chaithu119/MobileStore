package com.mobilestore.configurer;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;

@Configuration

@ComponentScan("com.mobilestore.controller,com.mobilestore.repository,com.mobilestore.service")
public class MobileStoreConfiguration {
	
	@Autowired
	private DataSource ds;
	
	
	
	
	@Bean
	public  LocalSessionFactoryBean getsessionfactory() {
		
		System.out.println("localsession");
		
		 LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		Properties p=new Properties();
		p.put("hibernate.show_sql", true);
		p.put("hibernate.format_sql", true);
		p.put("hibernate.hbm2ddl.auto", "create");
		p.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		
		factory.setDataSource(ds);
		factory.setHibernateProperties(p);
		factory.setAnnotatedClasses(Customer.class,ProductDetails.class);
		return factory;
	}
	
	@Bean(name="sessfactory")
	public SessionFactory getFactory(){
		return getsessionfactory().getObject();
	}
	
	@Bean
	public HibernateTemplate getTemplate(){
		return new HibernateTemplate(getFactory());
		
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver mr = new CommonsMultipartResolver();
	    System.out.println("hiihiii");
	    //mr.setMaxUploadSize(100000);
	    return mr;
	}

    	 
     }


