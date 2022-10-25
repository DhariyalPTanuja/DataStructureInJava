package com.assginment.linkedlistDs;

import java.util.Scanner;

public class NodeLinkedListMain {

	public static void main(String[] args) {

		System.out.println("LinkedListUC9");
		//Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
		
			
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		
		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(thirdNode);
		
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);
		
		
		System.out.println(" ");
		System.out.println("To insert 40 after 30 to the Linked List");
		Scanner scanobj = new Scanner(System.in);
		// search the position of element in linked list
		System.out.println("enter the element where new element insert: ");
		 int node = scanobj.nextInt();
		int index = simpleLinkedList.searchNode(node);
		 
		 System.out.println(" insert the new node : ");
		 int newNodeToBeInserted = scanobj.nextInt();
		
		 Node<Integer> newNodeToBeInserted1 = new Node<>(newNodeToBeInserted);
			simpleLinkedList.insert(newNodeToBeInserted1, index+2);


			SimpleLinkedListIterator<Integer> simpleLinkedListIterator1 = new SimpleLinkedListIterator<>();

			simpleLinkedListIterator1.iterateSimpleLinkedList(simpleLinkedList);
		System.out.println(" ");
		System.out.println("To delete element from the Linked List");
	
		// search the position of delete element in linked list
		System.out.println("enter the delete elementt: ");
		 int newNodeToBeDelete = scanobj.nextInt();
		 simpleLinkedList.searchNode(newNodeToBeDelete);
		
			simpleLinkedList.remove(newNodeToBeDelete);

			
			SimpleLinkedListIterator<Integer> simpleLinkedListIterator2 = new SimpleLinkedListIterator<>();
	
			simpleLinkedListIterator2.iterateSimpleLinkedList(simpleLinkedList);
		
			 System.out.println("The size of the linked list is: " 
                     + (simpleLinkedList).sizeOfLinkedList());
			
				
	}
}
