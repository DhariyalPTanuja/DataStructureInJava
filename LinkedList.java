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

	void remove(D nodeToBeRemoved) {

		if (headNode == null && tailNode == null && tempNode == null) {
			System.out.println("Empty list/linked list is underflow");
		}
		Node<D> currNode = headNode;
		prevNode = headNode;

		if (nodeToBeRemoved == currNode.getData()) {
			headNode = currNode.getNextNode();
			currNode.setNextNode(null);
		}
		while (currNode.getData() != nodeToBeRemoved) {
			prevNode = currNode;
			currNode = currNode.getNextNode();

		}
		prevNode.setNextNode(currNode.getNextNode());
		currNode.setNextNode(null);

	}

}
