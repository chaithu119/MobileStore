package com.mobilestore.controller;


import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.hloentity.ProductDetails;
import com.mobilestore.service.MobileStoreServiceInterface;


@Controller
public class MobileStoreController {

	
	@Autowired
	private MobileStoreServiceInterface service;

	
	@PostMapping(value="insert")
	public String customerDetailSend(@ModelAttribute("customer") Customer customer,Map<String,String> map) {
		
		System.out.println("it enter into controller");
		System.out.println(customer.getCid());
		String str=service.customerDetailsRegister(customer);
		map.put("result",str);
		return "ProductDetails";
		
		
	}
	
	@PostMapping(value="productinsert")
	public String productDetailSend(
		//@ModelAttribute("image") ProductDetailshlo image,
			@RequestParam("productid") int productid,
			@RequestParam("productcolor") String productcolor,
			@RequestParam("productDetails") String productDetails,
			@RequestParam("quantity") int quantity,
			@RequestParam("productname") String productname,
			@RequestParam("productdesc") String productdesc,
			@RequestParam("productprice") Float productprice,
			@RequestParam("productCompany") String productCompany,
			@RequestParam("image") MultipartFile image,
			HttpServletRequest req,Map<String,String> map) throws IOException {
		System.out.println(".................................................");
		//String path=context.getRealPath("/");
	/*	System.out.println(pdetails.getProductcolor());
		System.out.println(pdetails.getImage());*/
		//System.out.println(image.getProductDetails());
		//System.out.println(pdetails.getImage());
		System.out.println(".................................................");
		
		byte[] b=image.getBytes();
		ProductDetails p=new ProductDetails();
		p.setImage(b);
		p.setProductcolor(productcolor);
		p.setProductCompany(productCompany);
		p.setProductdesc(productdesc);
		p.setProductDetails(productDetails);
		p.setProductid(25);
		p.setProductname(productcolor);
		p.setProductprice(productprice);
		//String path=image.getOriginalFilename();
		
	//	InputStream is=image.getInputStream();
	//byte b[]=	image.getBytes();
	//	FileOutputStream fis =new FileOutputStream(new File("/home/webwerks/Desktop/ALL JARS/Files/"+path));
		
		//fis.write(b);
		
		
		//System.out.println(by);
		//Part p=req.getPart("image");
		
		
		
		
		
		
		String str=service.registerProductDetails(p);
		
		/*ProductDetails details=new ProductDetails();
		System.out.println("it enter into productcontroller");
		
		String str=service.registerProductDetails(details);
		map.put("result",str);*/
		return "result";
		
		
	}
	
	
	@PostMapping(value="login")
	public String customerDetaillogin(@RequestParam("uname") String email,@RequestParam("pwd") String password) {
		
		
		
		System.out.println("it enter into controller");
		
		int i=service.customergetlogin(email, password);
		
		if(i==1) {
			return "ProductDetails";
		}
		else
		return "errorpage";
		
		
	}
	
	
}
