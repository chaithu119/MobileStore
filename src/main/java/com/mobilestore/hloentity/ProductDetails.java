package com.mobilestore.hloentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;





@Entity
@Table(name="productde")
public class ProductDetails {
	
	
 
/*
    @GenericGenerator(name = "sequence", strategy = "sequence",parameters = {

            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),

            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),

    })*/

  //  @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
    
    
	@Id
	@GeneratedValue(generator="g1")
	@GenericGenerator(name="g1",strategy="increment")
	   @Column(length=10)
	private int productid;
	   @Column(length=20)
	private String productcolor;
	   @Column(length=50)
	   
	private byte[] image;
	   @Column(length=50)
	private String productDetails;
	   @Column(length=10)
	private int quantity;
	   @Column(length=20)
	private String productname;
	   @Column(length=20)
	private String productdesc;
	   @Column(length=10)
	private double productprice;
	   @Column(length=20)
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
	public void setImage(byte[] image) {
		this.image = image;
	}
	public byte[] getImage() {
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
