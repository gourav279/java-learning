package com.modifier.abstractmodifier;

public abstract class Abstract {
	
	int i;
	
	public abstract void implement();
	
//	public abstract void impl() {
//		
//	}
	
	public static void display() {
		System.out.println("Abstract Static method ");
	}
	
	static {
		System.out.println("Static block of Abstract Class");
	}
	
	public void implement1() {
		System.out.println("instead method of abstract method");
	}
	
	
}
