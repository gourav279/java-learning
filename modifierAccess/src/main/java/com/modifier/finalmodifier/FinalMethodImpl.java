package com.modifier.finalmodifier;

public class FinalMethodImpl extends FinalMethod {

	public void display1() {
		System.out.println("final method implement class call");
	}
	
//	public void display() {
//		                 can't be overrider by child 
//	}
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		f.display();
		f.display1();
		FinalMethodImpl f1 = new FinalMethodImpl();
		f1.display1();
		FinalMethod f2 = new FinalMethodImpl();
		f2.display1();
	}
}
