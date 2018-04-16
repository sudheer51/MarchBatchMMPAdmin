import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.By;
 
 
/**
This file is arraylist.java
*/
 
//Modify in master..
 
public class ArrayListEx {

	public static void main(String[] args) {
		
		 	
		/**
		 * What are generics in java??
		 * generics enable types (classes and interfaces) to be parameters when defining classes,
		 *  interfaces and methods. ... Stronger type checks at compile time
		 * List is an interface useful to store duplicate as-well-as unique object
		 */
		List<Integer> aList = new Vector<Integer>();
		//add,size,get
		 
		aList.add(5);
		aList.add(6);
		aList.add(7);
		aList.add(7);

		aList.iterator();
		System.out.println("size" + aList.size());
		
	 
		aList.remove(0);
		System.out.println("size" + aList.size());
		
		for(int i =0 ;i <aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
	}
}
