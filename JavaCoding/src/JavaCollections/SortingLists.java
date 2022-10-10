package JavaCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()) {
			return 1;
		}
		if(o1.length()<o2.length()) {
			return -1;
		}
		return 0;
	}	
}

class ReverseAlphabeticalComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}	
}

class employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + ":" + name;
	}
}

public class SortingLists {

	public static void main(String[] args) {
		/////////////Sorting Names///////////////////////
		List<String> names = new ArrayList<String>();
		names.add("Kim");
		names.add("Natasha");
		names.add("Whitney");
		names.add("Jade");
		names.add("Angela");
	/*	for sorting alphabetically
		Collections.sort(names);*/
	/*	for sorting with length of string in ascending order, call StringLengthComparator
		Collections.sort(names, new StringLengthComparator());*/
	//	for sorting with alphabetical order in reverse manner, call ReverseAlphabeticalComparator 
		Collections.sort(names, new ReverseAlphabeticalComparator());
		for(String name:names) {
		System.out.println(name);
		}
		
		//////////////////Sorting Numbers///////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(78);
		numbers.add(898);
		numbers.add(68);
		numbers.add(56);
		numbers.add(255);
		numbers.add(568);
	/*	for sorting in ascending order
		Collections.sort(numbers);*/
	//	for sorting in descending order call Comparator interface directly instead of creating separate class as done before	
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
			
		});
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
		///////////////////Sorting Objects////////////////////
		List<employee> emp = new ArrayList<employee>();
		
		emp.add(new employee(1,"Rachel"));
		emp.add(new employee(2,"Reacher"));
		emp.add(new employee(3,"Jack"));
		emp.add(new employee(4,"Tony"));
		emp.add(new employee(5,"Peter"));
		
		Collections.sort(emp, new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(employee emp1:emp) {
			System.out.println(emp1);
		}
		
		System.out.println("\n");
		Collections.sort(emp, new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
					if(o1.getId()<o2.getId()) {
						return 1;
					}
					if(o1.getId()>o2.getId()) {
						return -1;
					}
					return 0;
				}
		});
		
		for(employee emp1:emp) {
			System.out.println(emp1);
		}
	}

}
