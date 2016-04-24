package com.local.dev.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
	private ArrayList<E> list;

	public MyStack() {
		list = new ArrayList<E>();
	}

	public void push(E item) {
		list.add(item);
	}

	public E pop() {
		if (!isEmpty())
			return list.remove(size() - 1);
		else
			throw new EmptyStackException();
	}

	public E peek() {
		if (!isEmpty())
			return list.get(size() - 1);
		else
			throw new EmptyStackException();
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return (list.size() == 0);
	}

	@Override
	public String toString() {
		return "MyStack [al=" + list.toString() + "]";
	}

}