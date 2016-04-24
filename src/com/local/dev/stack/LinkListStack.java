package com.local.dev.stack;

import java.util.LinkedList;

public class LinkListStack {

	LinkedList<Integer> li = new LinkedList<Integer>();

	public void push(Integer data) {
		li.addFirst(data);
	}

	public void pop() {
		if (!li.isEmpty()) {
			li.removeFirst();
		}
	}

	public void peek() {
		System.out.println("  ");
		li.getFirst();
	}
}