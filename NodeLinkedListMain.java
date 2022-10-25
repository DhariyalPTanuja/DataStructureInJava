package com.assginment.linkedlistDs;

import java.util.Scanner;

public class NodeLinkedListMain {

	public static void main(String[] args) {

		System.out.println("LinkedListUC7");
		
		System.out.println("Ability to search LinkedList to find Node with value 30");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> fourthNode = new Node<>(40);
		Node<Integer> fifthNode = new Node<>(66);
		Node<Integer> sixthNode = new Node<>(60);
		Node<Integer> seventhNode = new Node<>(58);
		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(thirdNode);
		simpleLinkedList.add(fourthNode);
		simpleLinkedList.add(fifthNode);
		simpleLinkedList.add(sixthNode);
		simpleLinkedList.add(seventhNode);
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);
		System.out.println(" ");
		System.out.println("Search the node in the list");
		Scanner scanobj = new Scanner(System.in);
		 System.out.println("enter the search node : " );
		 int nodeToBeSearched = scanobj.nextInt();
		 simpleLinkedList.searchNode(nodeToBeSearched);
		 
	}
}
