package com.prodep.tutorials.java.classes;

public class Product {

	private int pid;
	private double price;
	private String pname;
	
	public void setValues(int lpid,String lpname, double lprice){
		pid = lpid;
		pname = lpname;
		price = lprice;
	}
	
	public void setPid(int lpid){
		pid = lpid;
	}
	public void setPname(String lpname){
		pname = lpname;
	}
	public void setPrice(double lprice){
		price = lprice;
	}
	
	public void showProductDetails(){
		System.out.println("PID : "+pid);
		System.out.println("Price : "+price);
		System.out.println("Pname : "+pname);
	}
}
