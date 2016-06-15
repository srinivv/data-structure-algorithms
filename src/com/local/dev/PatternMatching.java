package com.local.dev;

public class PatternMatching {

	public static void main(String[] args) {
		System.out.println(isValidPattern("224610"));
	}

	public static boolean isValidPattern(String str) {
		if (str != null && str.trim().length() > 1) {
			int size = str.length();
			for (int i = 1; i < size; i++) {
				for (int j = 0; j < i; j++) {
					int n1 = Integer.parseInt(str.substring(0, j + 1));
					int n2 = Integer.parseInt(str.substring(j + 1, i + 1));
					if (n1 > n2) {
						continue;
					}
					String n = "" + n1 + n2;
					if (n.length() == size) {
						return false;
					}
					while (n.length() < size) {
						int temp = n1 + n2;
						n += temp;
						n1 = n2;
						n2 = temp;
					}
					if (n.equals(str)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
