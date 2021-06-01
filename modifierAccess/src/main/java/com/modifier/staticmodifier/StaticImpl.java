package com.modifier.staticmodifier;

public class StaticImpl extends Static {
	
	public static void display() {
		System.out.println("static implementation");//method hiding 
	}
	
	public static void main(String[] args) {
		display();
	}
}
