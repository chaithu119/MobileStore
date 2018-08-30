package com.cap.mobilestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.mobilestore.aop.MobileStoreAop;
import com.mobilestore.configurer.MobileStoreConfiguration;

@SpringBootApplication
@Import(value= {MobileStoreConfiguration.class,MobileStoreAop.class})


public class MobileStoreApplication {

	
	
	public static void main(String[] args) {
		
		SpringApplication.run(MobileStoreApplication.class, args);
	}
}
