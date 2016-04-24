package com.local.dev.stack;

public class ArrayStack {

	private int size = 10;
	private int array[] = new int[size];
	private int top = -1;
	
	public void push(int e) {
		if (top < size -1) {
			top++;
			array[top] = e;
		} else {
			System.out.println("Stack Overflow!!");
		}
	}
	
	public void pop() {
		if (top > 0) {
			top--;
		} else {
			System.out.println("Stack empty!!");
		}
	}

	public void peek() {
		if (top >= 0) {
			System.out.println(array[top]);
		} else {
			System.out.println("Stack empty!!");
		}
	}
}
