package com.assginment.linkedlistDs;

public class NodeLinkedListMain {

	public static void main(String[] args) {
		
		System.out.println("LinkedListUC4");
		
		System.out.println("Ability to insert 30 between 56 and 70");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(70);

		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);


		System.out.println(" insert the new node");

		Node<Integer> newNodeToBeInserted = new Node<>(30);
		simpleLinkedList.insert(newNodeToBeInserted, 2);
			
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);

	}
}
