package com.assginment.linkedlistDs;

public class NodeLinkedListMain {

	public static void main(String[] args) {

		System.out.println("LinkedListUC6");

		System.out.println("Ability to delete the last element in the LinkedList of sequence 56->30->70");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> ThirdNode = new Node<>(70);

		LinkedList<Integer> simpleLinkedList = new LinkedList<>();

		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(ThirdNode);

		
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIterator = new SimpleLinkedListIterator<>();

		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);
		System.out.println(" ");
		System.out.println("Remove the Node Last node");
		simpleLinkedList.remove(ThirdNode.getData());
		
		SimpleLinkedListIterator<Integer> simpleLinkedListIteratorRemove = new SimpleLinkedListIterator<>();

		simpleLinkedListIteratorRemove.iterateSimpleLinkedList(simpleLinkedList);
	}
}
