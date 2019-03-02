package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("This");
		strings.add("isE");
		strings.add("an");
		strings.add("Array");
		strings.add("Liste");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String narray = strings.get(i);
			System.out.println(narray);
		}
		System.out.println();
		// 4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println();
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			String narray = strings.get(i);
			if (i % 2 == 1) {
				System.out.println(narray);
			}
		}
		System.out.println();
		// 6. Print all the Strings in reverse order.
		for (int i = strings.size() - 1; i >= 0; i--) {
			String narray = strings.get(i);
			System.out.println(narray);
		}
		System.out.println("7");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.size(); i++) {
			String narray = strings.get(i);
			for (int j = narray.length() - 1; j >= 0; j--) {
				char ch = narray.charAt(j);
				if (ch == 'e' || ch == 'E') {
					System.out.println(narray);
				}
			}

		}

	}
}
