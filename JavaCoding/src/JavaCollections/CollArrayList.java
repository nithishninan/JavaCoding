package JavaCollections;

import java.util.ArrayList;

public class CollArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(50);
		numbers.add(40);
		
		System.out.println(numbers.get(1));
		System.out.println("\nIteration 1:");
		for (int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		numbers.remove(1);
		
		System.out.println("Iteration 2:");
		for (Integer value:numbers) {
			System.out.println(value);
		}
	}}
