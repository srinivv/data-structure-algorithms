package com.local.dev;

public class Print {

	public static void main(String[] args) {
		int number = 15;
		
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.print("c");
		} else if (number % 3 == 0) {
			System.out.print("a");
		} else if (number % 5 == 0) {
			System.out.print("b");
		} else {
			System.out.print("n");
		}
	}
}
