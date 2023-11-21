package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> morningRoutine = new LinkedList<>();
		
		
		if(!morningRoutine.isEmpty()) {
		System.out.println("The first element in the list is: "+ morningRoutine.getFirst());

		}
		if(!morningRoutine.isEmpty() && morningRoutine.peekFirst() != null) {
		System.out.println("the first element is :" + morningRoutine.peekFirst().toUpperCase());
		}
		
		morningRoutine.add("brushing my teeth");
		morningRoutine.addFirst("taking my dog for a walk");
		morningRoutine.push("buying groceries");
		morningRoutine.offer("Reading 1 chapter of a book");
		
//		System.out.println("I used pop function " + morningRoutine.pop());
		
		
		System.out.println(morningRoutine);
		
		System.out.println("I have completed first task : " + morningRoutine.pollFirst());
		System.out.println("I have completed last task: " + morningRoutine.pollLast());
		
		System.out.println(morningRoutine);
		
	}
		

}
