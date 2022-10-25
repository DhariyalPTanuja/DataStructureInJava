package com.assginment.linkedlistDs;

import java.util.Scanner;

public class NodeLinkedListMain {

	public static void main(String[] args) {

		System.out.println("LinkedListUC10");
		
		//Ability to create Ordered Linked List in ascending order of data entered
			
		
		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		
		Scanner scanobj = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println(" Enter the node : " );
			
			Node<Integer> newNodeToBeInserted= new Node<>(scanobj.nextInt());
			simpleLinkedList.add(newNodeToBeInserted);
		}
		
		
		
			
			SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

			simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);
	}
}
