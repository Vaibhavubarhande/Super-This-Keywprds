package com.superthis;

public class Parent1 {

	String name;
	String surname;
	int age;
	public Parent1(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	
	public static void main(String[] args) {

		Parent1 pa = new Parent1("Vaibhav", "Ubarhande", 25);

		System.out.println(pa.age);
	}
}
