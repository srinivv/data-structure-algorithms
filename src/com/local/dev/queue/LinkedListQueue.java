package com.local.dev.queue;

import java.util.LinkedList;

public class LinkedListQueue {

	private LinkedList<Object> queue = new LinkedList<Object>();

	public void enqueue(Object obj) {
		queue.addLast(obj);
	}

	public Object dequeue() {
		return queue.removeFirst();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
