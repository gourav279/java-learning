package com.modifier.finalmodifier;

public final class Final {

	final int i=12;//must be instillization
	static final int j=12;//must be instillization
	
	
	public void display() {
		System.out.println("final instant method");
	}
	
	public static void main(String[] args) {
		final int x=10;//must be instillization
		Final f = new Final();
		f.display();
		System.out.println(f.i +" "+ x);
	}
	
}
