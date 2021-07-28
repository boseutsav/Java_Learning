package pkg_learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class class_41 {
	public static void main(String[] args) {

		/*
		 * TODO Auto-generated method stub Java collections Framework Tutorials
		 * List A List is an ordered collection (sometimes called a sequence).
		 * Lists may contain duplicate elements. Elements can be inserted Or
		 * accessed by their position in the list, using a zero-based index.
		 */

		/*
		 * ArrayList ArrayList is a resizable-array implementation of the List
		 * interface. It implements all optional list operations, and permits
		 * all elements, including nul1.- ArrayList can dynamically grow and
		 * shrink as per the need.
		 */

		// ArrayList<datatype> objectname = new ArrayList<datatype> ();
		// 1st method
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Hello worla");
		obj1.add("Alok");
		obj1.add("Bharat");
		obj1.add("utsav");
		System.out.println("Print elements" + obj1);
		System.out.println(obj1.size());

		ArrayList<Integer> obj2 = new ArrayList<Integer>();
		obj2.add(1);
		obj2.add(2);
		obj2.add(3);

		// 2nd method
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Alok", "Mary", "Bharat"));
		System.out.println(obj);
		ArrayList<Integer> obj3 = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6, 6, 7, 8));
		System.out.println(obj3);

		// 3rd Method
		ArrayList<String> obj4 = new ArrayList<String>();
		obj4.add(0, "Test");
		obj4.add(2, "Test6");
		obj4.add(3, "Test5");
		obj4.add(4, "Test3");
		obj4.add(5, "Test4");
		obj4.add(6, "Test2");
		obj4.add(7, "Test1");

		System.out.println(obj4);
		System.out.println(obj4.size());

		
		HashMap<Integer,String> Bud = new HashMap<Integer,String>(); 
		// 4th Method
		ArrayList<String> array123 = new ArrayList<String>() {
			{
				add("Hallo");
				add("KHallo");
				add("Challo");
			}
		};
		System.out.println(array123);
		// remove elements like this
		obj4.remove(1);
		obj4.remove("Test3");
		System.out.println(obj4);
		System.out.println(obj4.size());

		// set value for element Update in ArrayList

		obj4.set(0, "Alok");
		System.out.println(obj4);
		System.out.println(obj4.size());

		/* Check if value is present or not Boolean value */
		System.out.println(obj4.contains("Alok1"));

		/*
		 * It is used for removing all the elements of the array list in one go.
		 */
		obj4.clear();
		System.out.println(obj4);

		/* int indexOf(object o): Gives the index of the object o. */
		/*
		 * If the element is not found in the list then this method returns the
		 * value -1
		 */

		System.out.println(obj1.indexOf("utsav1"));

		/* For Loop for iterating ArrayList */
		ArrayList<String> obj5 = new ArrayList<String>();
		obj5.add(1, "Test55");
		obj5.add(2, "Test45");
		obj5.add(0, "Tests");
		obj5.add(3, "Test35");
		obj5.add(4, "Test25");
		obj5.add(5, "Test15");
		System.out.println(obj5);
		System.out.println(obj5.size());

		System.out.println("For Loop");
		for (int il=0; il<obj5.size(); il++) {
			System.out.println(obj5.get(il));
		}

		/* Advanced For Loop */
		System.out.println("Advanced For Loop");
		for (String s : obj5) {
			System.out.println(s);
		}

		/* while Loop for iterating ArrayList */
		System.out.println("while Loop");
		int count = 0;
		while (obj5.size() > count) {
			System.out.println(obj5.get(count));
			count++;
		}
		/* Looping array List using Iterator */
		System.out.println("Iterator");
		Iterator<String> a = obj5.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}

		System.out.println("======================================================");
		/*
		 * How to sort ArrayList in Java we are doing it by simply calling the
		 * collections. sort (arraylist) method.(string Type) The output List
		 * will be sorted alphabetically.
		 */

		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("us");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* unsorted List */
		System.out.println(listofcountries);

		System.out.println("-------------------++++++_----________-000========");
		/* Sort List/ */
		listofcountries.sort(Collections.reverseOrder());

		System.out.println(listofcountries);

		for (String i1 : listofcountries) {
			System.out.println(i1);
		}

		// The same collections. sort0 method can be used for sorting the
		// Integer ArrayList as
		ArrayList<Integer> obj6 = new ArrayList<Integer>();
		obj6.add(11);
		obj6.add(2);
		obj6.add(7);
		obj6.add(3);

		/* unsorted List */
		System.out.println(obj6);

		// sort List
		Collections.sort(obj6);
		System.out.println(obj6);

		for (int i : obj6) {
			System.out.println(i);
		}

		Collections.sort(obj6, Collections.reverseOrder());
		System.out.println(obj6);

		// String
		Collections.sort(listofcountries, Collections.reverseOrder());
		System.out.println(listofcountries);

		// Java ArrayList addAll(collection c)
		// addAll() method of java.util.ArrayList class.
		// This method is used for adding all the elements of a list to the
		// another list.
		// It adds all the elements of specified collection to the end of the
		// calling list.
		// It throws NullPointerException if the specified collection is null.

		obj6.addAll(obj3);
		System.out.println(obj6);
		listofcountries.addAll(obj5);
		System.out.println(listofcountries);
		// two ArrayList of String type and we are adding the element of second
		// arraylist
		// at the 3rd position (index =2) of first arraylist.
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("orange");
		al.add("Grapes");
		al.add("Mango");
		System.out.println("ArrayList1 before addAll" + al);

		// ArrayList2
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Fig");
		al2.add("Pear");
		al2.add("Guava");
		al2.add("Banana");
		System.out.println("ArrayList2 content:" + al2);
		// Adding ArrayList2 in ArrayList1 at 3rd position (index=2)
		al.addAll(2, al2);
		System.out.println("ArrayList1 after adding ArrayList2 at 3rdPos: \n" + al);
		/** How to convert ArrayList to string array in java **/
		// Method 1: Manual way of conversion using ArrayList getO method
		/* ArrayList declaration and initialization */
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("string1");
		arrlist.add("string2");
		arrlist.add("string4");
		arrlist.add("string3");

		/* ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];

		for (int j = 0; j < arrlist.size(); j++)
			array[j] = arrlist.get(j);

		/* Displaying Array elements */

		for (String kC : array)
			System.out.println(kC);

		// Method2; conversion using toArray() method
		/* * ArrayList declaration and initialization/
		 
		 /*Displaying array elements*/
		 ArrayList<String> friendsnames= new ArrayList<String>(); 
		 friendsnames.add("Ankur");
		 friendsnames.add("Ajeet"); 
		 friendsnames.add("Harsh");
		 friendsnames.add("john"); 
		/*ArrayList to Array conversion String*/
		String frnames[] = friendsnames.toArray(new String[friendsnames.size()]);
		for (String k : frnames)
			System.out.println(k);

		/***
		 * How to convert an array to ArrayList in java Array Declaration and
		 * initialization
		 */
		String citynames[] = { "Agra", "Mysore", "chandigarh", "Bhopal" };
		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New city2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist)
			System.out.println(str);
		/***
		 * collections.addAll method Array Declaration and initialization
		 ***/
		String array1[] = { "Hi", "Hello", "Howdy", "Bye" };
		/* ArrayList declaration */
		ArrayList<String> arraylist = new ArrayList<String>();
		/* Conversion */
		Collections.addAll(arraylist, array1);
		/* Adding new elements to the converted List */
		arraylist.add("string1");
		arraylist.add("string2");

		/* Display arraylist */
		for (String str1 : arraylist)
			System.out.println(str1);

		/* ArrayList declaration */
		ArrayList<String> arraylist2 = new ArrayList<String>();
		/* Initialized Array */
		String array2[] = { "Text1", "Text2", "Text3", "Text4" };
		/*
		 * array.length returns the current number of elements present in array
		 */
		for (int ik = 0; ik < array2.length; ik++)

			/* we are adding each array element to the ArrayList */
			arraylist2.add(array2[ik]);

		/* ArrayList content */
		for (String str11 : arraylist2)
			System.out.println(str11);
	}
}
