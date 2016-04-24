package com.local.dev.inheritance;

public class Child extends Parent {

	public String publicMethod1(int a) {
		return "child";
	}
	
	private Integer publicMethod2(int a) {
		return 2;
	}
	
	public static String publicMethod3() {
		return "static child";
	}

}
