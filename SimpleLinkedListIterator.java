package com.assginment.linkedlistDs;

public class SimpleLinkedListIterator<D> {
	
public void iterateSimpleLinkedList(LinkedList<D> simpleLinkedList) {
		
		Node<D> tempNode = simpleLinkedList.headNode;
		 while(tempNode != null) {
			 System.out.print(tempNode.getData() + " -> " );
			 
			 tempNode = tempNode.getNextNode();
}
}
}