package com.modifier.staticmodifier;

public class Static {

	static int x;
	
	public static void display() {
		System.out.println("Static Method");
		x=11;
	}
	
	public static void main(String[] args) {
		System.out.println("static concepts");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println(x);
		display();
		System.out.println(x);
		x=10;
		System.out.println(x);
	}
}
