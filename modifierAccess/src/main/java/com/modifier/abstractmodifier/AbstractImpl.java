package com.modifier.abstractmodifier;

public class AbstractImpl extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl ab = new AbstractImpl();
		ab.implement();
		ab.implement1();
		display();
		ab.i = 10;
		System.out.println(ab.i);
	}

	@Override
	public void implement() {
		System.out.println("Abstract method implement by child");
	}

}


//abstract modifier used for method and class
//overridening has been happened by abstract modifier