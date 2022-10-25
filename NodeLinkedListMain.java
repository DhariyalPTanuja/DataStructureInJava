package com.assginment.linkedlistDs;



public class NodeLinkedListMain {

	public static void main(String[] args) {
		
		System.out.println("LinkedListUC2");
		System.out.println("Ability to create Linked List by adding 30 and 56 to 70");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);

		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(thirdNode);

		
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);

	}
}
