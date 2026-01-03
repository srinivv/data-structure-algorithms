package com.local.dev;

import java.util.ArrayList;
import java.util.List;

public class UniqueFromLists {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(2);
		l2.add(3);

		List<Integer> l3 = new ArrayList<Integer>(l2);
		l3.retainAll(l1);
	}
}
