package JavaCollections;

import java.util.HashMap;

public class ColHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(5, "Five");
		map.put(6,"Six");
		map.put(8, "Eight");
		map.put(4, "Four");
		map.put(2, "Two");
		
		map.put(8, "Hello");
		String text = map.get(8);
		System.out.println(text);
	}
}