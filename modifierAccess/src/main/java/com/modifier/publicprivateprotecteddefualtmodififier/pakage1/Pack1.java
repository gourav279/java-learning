package com.modifier.publicprivateprotecteddefualtmodififier.pakage1;

public class Pack1 {

	public int publicinstance = 1;
	public static int publicstatic = 2;
	int defaultinstance = 10;// default modifier instance variable
	static int defaultstatic = 20;// default modifier static variable
	private int privateinstance = 30;// private modifier instance variable
	private int privatestatic = 40;// private modifier static variable
	protected int protectedinstance = 50;// protected modifier instance variable
	protected int protectedstatic = 60;// protected modifier instance variable

	public static void main(String[] args) {
		Pack1 p = new Pack1();
		System.out.println(p.publicinstance+" "+p.defaultinstance+" "+p.privateinstance+" "+p.protectedinstance);
		System.out.print(p.publicstatic+" "+p.defaultstatic+" "+p.privatestatic+" "+p.protectedstatic);
	}

}
