package fjs.excercise;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Black");
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.remove(3);
		colors.add("Pink");
		colors.add("Yellow");

		System.out.println(colors);
		System.out.println(colors.contains("Pink"));
		System.out.println(colors.size());
		System.out.println(colors.get(4));

	}

}
