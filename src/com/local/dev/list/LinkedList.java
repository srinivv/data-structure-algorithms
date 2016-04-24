package com.local.dev.list;

public class LinkedList<E> {

	public Node<E> head;
	public Node<E> tail;

	public LinkedList() {
		this.head = new Node<E>();
		this.tail = new Node<E>();
		head.next = tail;
	}

	public void addLast(E e) {
		Node<E> node = new Node<E>(); // e and next are null
		tail.data = e;
		tail.next = node;
		tail = node;
	}

	public void addFirst(E e) {
		Node<E> node = new Node<E>(); // e and next are null;
		node.next = head.next;
		node.data = e;
		head.next = node;
	}

	public E deleteFirst() {
		Node<E> first = head.next;
		head.next = first.next;
		return first.data;
	}

	public E deleteLast() {
		// cannot do without iteration of the list! :-(
		throw new UnsupportedOperationException();
	}

	public Node<E> findFirst(E e) {
		Node<E> curr = head.next;
		while (curr != null) {
			if (curr.data != null && curr.data.equals(e))
				return curr;
			curr = curr.next;
		}
		return null;
	}

	static <E> E deleteNode(Node<E> node) {
		if (node == null || node.next == null)
			return null;

		E retval = node.data;
		Node<E> next = node.next;
		node.data = next.data;
		node.next = next.next;
		return retval;
	}

	public void print() {
		Node<E> curr = head.next;
		while (curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}
