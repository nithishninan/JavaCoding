package JavaCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ColLinkedList {
	public static void main(String[] args) {
	List<Integer> arraylist = new ArrayList<Integer>();
	/*
	 * ArrayList manage arrays internally
	 * [0][1][2][3][4][5][6].....
	 */
	List<Integer> linkedlist = new LinkedList<Integer>();
	/*
	 * LinkedLists consists of elements where each element
	 * has a reference to the previous and next element
	 * [0]->[1]->[2]->[3]....
	 */
	doTimings( "ArrayList" , arraylist);
	doTimings("LinkedList", linkedlist);
}	
	private static void doTimings(String type, List<Integer> list) {
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		//Add items at end of list
		/*for(int i=0; i<1E5; i++) {
			list.add(i);
		}*/
		/*for(int i=0; i<1E5; i++) {
			list.add(0,i);
		}*/
		for(int i=0; i<1E5; i++) {
			list.add(list.size()-100,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+ (end - start) + "ms for " +type);
	}
	}
