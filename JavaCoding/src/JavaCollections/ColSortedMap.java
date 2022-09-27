package JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ColSortedMap {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//Different types of Map for key value pair
		System.out.println("The list for HashMap(Unsorted/Random Map) as follows:");
		testMap(hashMap);
		System.out.println("\nThe list for LinkedHashMap(Map that follows the same order as mentioned) as follows: ");
		testMap(linkedHashMap);
		System.out.println("\nThe list for TreeMap(sorted Map) as follows: ");
		testMap(treeMap);
	}

	private static void testMap(Map<Integer, String> map) {
		map.put(9,  "Carmella");
		map.put(7,  "Lisa");
		map.put(12,  "Nicole");
		map.put(8,  "Angela");
		map.put(1,  "Amy");
		map.put(0,  "Natalia");
		map.put(15,  "Kiara");
		map.put(6,  "Jessy");
		
		for(Integer key:map.keySet()) {
			String value = map.get(key);
			System.out.println(key+ " : " +value);
		}
	}

}
