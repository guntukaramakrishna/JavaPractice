package com.prodep.tutorials.java.classes;

public class TestProduct {

	public static void main(String[] args) {
		Product p1;
		p1 = new Product();
		
		p1.setValues(1231,"TV",37223.00);
		p1.showProductDetails();
		
	}
}
