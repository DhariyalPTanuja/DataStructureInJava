package com.assginment.linkedlistDs;



public class Node<D> {
	
	private D data;
	
	private Node<D> nextNode;
	private Node<D> previousNode;

	//constructor
	public Node(D data) {
		this.data = data;
		System.out.println("Node - " + data);

	}

	public void setNextNode(Node<D> nextNode2) {
		this.nextNode = nextNode2;
	}
	public Node<D> getNextNode(){
		return nextNode;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}
	public void setPreviousNode(Node<D> previousNode) {
		this.previousNode = previousNode;
	
	}
	public Node<D> getPreviousNode(){
		return previousNode;
		
	}
	
	
}
