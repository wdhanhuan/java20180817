package org.hans.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("hello");
		l.add("world");
		l.add("java");
		System.out.println("foreach:");
		for (String str : l) {
			System.out.println(str);
		}
		System.out.println("toArray:");
		String[] array = l.toArray(new String[l.size()]);
		for (String str : array) {
			System.out.println(str);
		}
		Iterator<String> it = l.iterator();
		System.out.println("itone:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("ittwo:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
