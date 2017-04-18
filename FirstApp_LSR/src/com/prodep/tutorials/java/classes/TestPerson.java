package com.prodep.tutorials.java.classes;

class Person {
	
	float height;
	float weight;
	String color;
	char gender;
	String name;

	void talk() {
		System.out.println(name+" is talking");
	}
	void walk() {
		System.out.println(name+" is walking");
	}
	void sit() {
		System.out.println(name+" is sitting");
	}
	
	void showPerson(){
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
		System.out.println("Weight is "+weight);
		System.out.println("Color is "+color);
		System.out.println("Gender is "+gender);
	}
}
public class TestPerson {

	public static void main(String[] args) {
	
		Person p = new Person();
		p.color = "white";
		p.height = 5.5f;
		p.weight = 54f;
		p.name = "David";
		p.gender = 'm';
		
		p.talk();
		p.sit();
		p.showPerson();
		
		Person ramu = new Person();
		ramu.color = "white";
		ramu.height = 5.5f;
		ramu.weight = 54f;
		ramu.name = "Ramu";
		ramu.gender = 'm';
		
		ramu.showPerson();
		
	}
}
