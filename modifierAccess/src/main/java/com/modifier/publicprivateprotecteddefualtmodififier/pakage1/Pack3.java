package com.modifier.publicprivateprotecteddefualtmodififier.pakage1;


public class Pack3 {

	public static void main(String[] args) {
		Pack1 p = new Pack1();
		System.out.println(p.publicinstance+" "+p.defaultinstance+" "+p.protectedinstance);
		System.out.println(p.publicstatic+" "+p.defaultstatic+" "+p.protectedstatic);
	}
	
}
