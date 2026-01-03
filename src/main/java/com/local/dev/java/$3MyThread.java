package com.local.dev.java;

public class $3MyThread extends Thread {
	public void run() {
		try {
			method1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void method1() throws InterruptedException {
		System.out.println("I am here 1");
		Thread.sleep(100);
		System.out.println("I am here 2");
	}
}
