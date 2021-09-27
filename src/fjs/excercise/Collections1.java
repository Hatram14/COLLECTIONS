package fjs.excercise;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Snake");

		Collections.sort(animals);

		System.out.println(animals);

		Collections.max(animals);

		System.out.println(animals);

		Collections.reverse(animals);

		System.out.println(animals);

		Collections.shuffle(animals);

		System.out.println(animals);

	}

}
