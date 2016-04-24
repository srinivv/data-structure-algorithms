package com.local.dev.list;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("e");

		// list.print();

		list = reverse(list.head);
		list.print();
	}

	public static LinkedList<String> reverse(Node<String> head) {
		LinkedList<String> list = new LinkedList<String>();
		if (head == null || head.next == null) {
			list.addLast(head.data);
			return list;
		}

		Node<String> current = head;
		while (current != null && current.next != null) {
			list.addLast(head.data);
			Node<String> temp = current.next;
			current.next = temp.next;
			temp.next = head;
			head = temp;
		}
		return list;
	}

	public static Node<String> reverse1(Node<String> head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node<String> todoList = head.next;
		Node<String> reverseList = head;
		reverseList.next = null;

		while (todoList != null) {
			Node<String> temp = todoList;
			todoList = todoList.next;

			temp.next = reverseList;
			reverseList = temp;
		}
		return reverseList;
	}

}
