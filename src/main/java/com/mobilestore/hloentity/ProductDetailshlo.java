package com.mobilestore.hloentity;



import org.springframework.web.multipart.MultipartFile;

public class ProductDetailshlo {
	

	 
	private int productid;
	  
	private String productcolor;
	  
	private MultipartFile image;
	 
	private String productDetails;
	  
	private int quantity;
	  
	private String productname;
	 
	private String productdesc;
	 
	private double productprice;
	   
	private String productCompany;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductcolor() {
		return productcolor;
	}
	public void setProductcolor(String productcolor) {
		this.productcolor = productcolor;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public MultipartFile getImage() {
		return image;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productcolor=" + productcolor + ", image=" + image
				+ ", productDetails=" + productDetails + ", quantity=" + quantity + ", productname=" + productname
				+ ", productdesc=" + productdesc + ", productprice=" + productprice + ", productCompany="
				+ productCompany + "]";
	}
	


}
