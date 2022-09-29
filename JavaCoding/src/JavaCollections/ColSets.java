package JavaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Sample Code for Sets
public class ColSets {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		//Method in Set interface to check whether set is empty
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty at the start");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty at the end");
		}
		
		//Adding duplicate items wont be considered in sets
		set1.add("mouse");
		
		//The result wont have any specific order or placed randomly
		System.out.println(set1);
		
		/////// Iteration ///////
		for(String element: set1) {
			System.out.println(element);
		}
		
		////// Does set contain /////
		if(set1.contains("Adele")) {
			System.out.println("Contains Adele");
		}
		if(set1.contains("cat")) {
			System.out.println("Contains Cat");
		}
		
		/////// Intersection ///////
		//Use treeset to get the result in specific order
		Set<String> set2 = new TreeSet<String>();
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		for(String element1:intersection) {
			System.out.println(element1);
		}
		
		////// Difference /////////
		Set<String> difference = new HashSet<String>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
		for(String element:difference) {
			System.out.println(element);
		}
	}

}
