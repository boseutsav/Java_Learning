package pkg_learning;

import java.util.ArrayList;

public class arraylistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int meaarr[] = {0};
		for(int e:meaarr)
			System.out.println(e);
		System.out.println(meaarr.length);
		
		ArrayList <Integer> mylist = new ArrayList<Integer>(5);
		
		System.out.println("Arraylist size:"+mylist.size());
		
		mylist.add(0, 3);
		mylist.add(4);
		mylist.set(0, 2);
		for(Integer e: mylist) // also for(int e: mylist) is correct
			System.out.println(e);
		System.out.println("Arraylist size:"+mylist.size());
		
		mylist.remove(1);
		System.out.println(mylist.size());
		for(Integer e: mylist) // also for(int e: mylist) is correct
			System.out.println(e);
		
		mylist.clear();
		System.out.println(mylist.size());
		mylist.add(0, 2);
		mylist.set(0,80);
		
		for(Integer e: mylist) // also for(int e: mylist) is corret
			System.out.println("Arraylist:"+e);
	}

}
