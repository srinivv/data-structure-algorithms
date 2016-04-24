package com.local.dev.inheritance;

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		
		String publicMethod1 = p.publicMethod1(1);
		System.out.println(publicMethod1);

		String publicMethod3 = p.publicMethod3();
		System.out.println(publicMethod3);
	}
}
