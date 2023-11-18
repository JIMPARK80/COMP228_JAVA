package Week10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class ListTest {
	public static void main( String[] args)
	{
		// add colors elements to list1
		String[] colors1 =
			{ "black", "yellow", "green" ,"blue"};
		List< String > list1 = new LinkedList < String >();
		
		for ( String color: colors1)
			list1.add( color);
		
		// add colors elements to list2
		String[] colors2 =
			{ "gold", "white", "brown" ,"blue" ,"gray" };
		List< String > list2 = new LinkedList < String >();
		
		for ( String color: colors1)
			list2.add( color);
		
		list1.addAll( list2 ); // concatenate listsS
		list2 = null; 
		printList(list1);
	}
	// print List
	private static void printList( List < String > list) {
		System.out.println("\nlist: ");
	}
	// convert to uppercase
	private static void convertToUppercaseStrings( List < String > list) {
		
	}
	// remove items
	private static void removeItems() {
		
	}
	// print reversed list
	private static void printReversedList() {
		
	}
}
