package com.modifier.publicprivateprotecteddefualtmodififier.pakage2;

import com.modifier.publicprivateprotecteddefualtmodififier.pakage1.Pack1;

public class Pack2 extends Pack1{

	public static void main(String[] args) {
		Pack1  p = new Pack1();
		System.out.println(p.publicinstance+" "+p.publicstatic);
		Pack2 p1 = new Pack2();
		System.out.println(p1.publicinstance+" "+p1.protectedinstance);
		System.out.println(p1.publicstatic+" "+p1.protectedstatic);
	}
	
}
