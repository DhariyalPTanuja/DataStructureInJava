package com.assginment.linkedlistDs;


public class LinkedList<D> {

	public Node<D> headNode = null;

	public Node<D> tailNode = null;

	public Node<D> tempNode = null;

	public Node<D> prevNode = null;

	void add(Node<D> newNode) {
		if (headNode == null && tailNode == null && tempNode == null) {
			headNode = newNode;
			tailNode = newNode;
			tempNode = newNode;
		} else {
			tempNode.setNextNode(newNode);// Previous node reference
			tailNode = newNode;
			tailNode.setNextNode(null);
			tempNode = newNode;

		}
	}
	
	public void insert(Node<D> newNodeToBeInserted, int postion) {
		int index = 0;
		Node<D> currNode = headNode;
		while (index < postion -2 ) {
			currNode = currNode.getNextNode();
			System.out.println(currNode.getData());
			index++;
		}
		Node<D> nextNode = currNode.getNextNode();
		newNodeToBeInserted.setNextNode(nextNode);
		currNode.setNextNode(newNodeToBeInserted);
	}
	
}
