package fjs.excercise;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();
//		String value = it.next();
//		System.out.println(value); //fox

		while (it.hasNext()) {
			String pt = it.next();
			System.out.print(pt + " ");
		}

	}

}
