package com.local.dev.java;

public class $1TestInheritance {

	public static void main(String[] args) {
		$1Parent p = new $1Child();
		
		String publicMethod1 = p.publicMethod1(1);
		System.out.println(publicMethod1);

		String publicMethod3 = p.publicMethod3();
		System.out.println(publicMethod3);
	}
}
