package fjs.excercise;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> colors = new LinkedList<String>();

		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.remove(3);
		colors.add("Pink");
		colors.add("Yellow");

		for (String duyet : colors) {
			System.out.print(duyet + " ");
		}

		System.out.println("");
		System.out.println("*******************");

		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}

	}
}
