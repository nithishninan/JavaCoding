package JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
//Using Custom Objects in sets and keys in Maps

class  Person{
	private int id;
	private String name;
	
 //	Adding constructors, toString and hashCode can be done by this shortcut:- right click->Source->Select specific method/requirement
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	/*Adding hashCode method to get unique value in results by selecting different conditions:-
		1. Unique id
		2. Unique name
		3. Unique name and id
		For this program, we have selected third condition
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class CustomObjectinSetandMap {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Lisa");
		Person p2 = new Person(1, "Carmella");
		Person p3 = new Person(2, "Shyla");
		Person p4 = new Person(1, "Carmella");
		
	//Replacing String with object created using class Person  for adding custom objects in Maps	
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
	//	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
	/*	map.put("Lisa", 0);
		map.put("Carmella", 1);
		map.put("Shyla", 2);
		map.put("Carmella", 1);
		*/

		for (Person key: map.keySet()) {
			System.out.println(key+ ":" +map.get(key));
		}
		
		//Replacing String with object created using class Person  for adding custom objects in Sets	
		Set<Person> set  = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
	/*	Set<String> set = new LinkedHashSet<String>();
		set.add("Lisa");
		set.add("Carmella");
		set.add("Shyla");
		set.add("Carmella");
		*/
		
		System.out.println(set);
	}

}
