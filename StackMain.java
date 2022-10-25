package com.assignment.StackQueueDs;

public class StackMain {

	public static void main(String[] args) {

		// to peak and pop from the Stack till it is empty
		StackUsingLinkedList<Integer> s = new StackUsingLinkedList();
		s.push(70);
		s.push(30);
		s.push(56);
		System.out.println(s);
		int topValue = s.peek();
		System.out.println(topValue);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
	}
}