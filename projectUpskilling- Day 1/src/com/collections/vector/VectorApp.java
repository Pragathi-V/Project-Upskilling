package com.collections.vector;

import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		
		Vector<String> toDoVector = new Vector<>(2,3);
		System.out.println("initial capacity before adding elements is " +toDoVector.capacity());
		
		
		toDoVector.add("Cleaning the bathroom");
		toDoVector.add("Paying the bills");
		toDoVector.add("Buying the groceries");
		
		System.out.println("Capacity after adding elements is "+toDoVector.capacity());
		System.out.println("Size of vector is " +toDoVector.size());
		
		System.out.println("The first element is: " +toDoVector.firstElement());
		System.out.println("The last element is: " +toDoVector.lastElement());
		
		
		
		System.out.println("The elements are: " );
		for(String s:toDoVector) {
			System.out.println("- " +s);
		}
		
		toDoVector.set(2, "washing dishes");
		System.out.println("The elements are: " );
		for(String s:toDoVector) {
			System.out.println("- " +s);
		}
		
		System.out.println(toDoVector.get(0));
		
	}
}
