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
//insert node
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

// Search node
public int searchNode(D nodeToBeSearched) {  
	Node<D> tempNode = headNode;
    int index = 0;  
    boolean flag = false;  
    //Checks whether list is empty  
    if(headNode == null) {  
        System.out.println("List is empty"); 
      
    }  
    else {  
        while(tempNode != null) {  
             //Compares node to be found with each node present in the list  
            if(tempNode.getData() == nodeToBeSearched) {  
                flag = true;
                break;
            }  
            index++;  
            tempNode = tempNode.getNextNode();
        }  
    }
        if(flag)  
	         System.out.println("Element is present in the list at the position : " + index);  
	    else  
	         System.out.println("Element is not present in the list");
		return index;  
		 
    }  
   
}  
