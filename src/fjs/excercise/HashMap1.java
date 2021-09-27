package fjs.excercise;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, Integer> points = new HashMap<String, Integer>();

		points.put("An ", 123);
		points.put("Laura ", 346);
		points.put("Tila ", 143);
		points.put("Zona ", 386);

		System.out.println(points);
		System.out.println(points.get("Tila "));
		System.out.println(points.containsValue(145));
	}

}
