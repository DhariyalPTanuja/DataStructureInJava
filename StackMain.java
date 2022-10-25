package com.assignment.StackQueueDs;



public class StackMain {
	
public static void main(String[] args) {
	

	
	 //creating and using stack of integers
    StackUsingLinkedList<Integer> s=new StackUsingLinkedList();
    s.push(70); 
    s.push(30); 
    s.push(56);
    System.out.println(s);

}
}