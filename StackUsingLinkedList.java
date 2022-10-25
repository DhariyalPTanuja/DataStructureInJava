package com.assignment.StackQueueDs;

public class StackUsingLinkedList<T> {
	
	    //T is the type parameter
	    Node top; //topmost element of stack

	    //defines each node of stack
	    class Node{
	       T value; 
	       Node next;  
	 
	       public Node(T value){
	         this.value=value;  
	         next=null;
	       }
	    }
	    //Perform push operation 
	    public void push(T value){
	     Node current=new Node(value);
	     if(isEmpty())
	        top=current; //if empty stack
	     else{
	        current.next=top;
	        top=current;
	     }
	    }
	   
	    //This function returns the entire stack
	    public String toString(){
	     Node current=top;
	        StringBuilder s=new StringBuilder();
	     System.out.println("\n STACK--------------");
	     
	     while(current!=null){
	       s.append(current.value+"  ");
	       current=current.next;
	     }

	        return s.toString();
	    }
	   
	    //This function checks emptiness of stack
	    public boolean isEmpty(){
	     return (top==null)?true:false;
	    }    
	}
