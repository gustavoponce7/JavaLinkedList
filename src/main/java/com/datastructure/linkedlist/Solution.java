package com.datastructure.linkedlist;

public class Solution {
	
	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.pushFront(new Node("A"));
		linkedList.pushFront(new Node("B"));
		linkedList.pushFront(new Node("C"));
		linkedList.pushBackUsingTail(new Node("X"));
		linkedList.pushBackUsingIteration(new Node("Z"));
		linkedList.printLinkedList();
		linkedList.popFront();
		linkedList.popBack();
		linkedList.printLinkedList();
		System.out.println("Front Node: " + linkedList.topFront().getValue());
		System.out.println("BacK Node: " + linkedList.topBack().getValue());
		System.out.println("Existst X: " + linkedList.find(new Node("X")));
		System.out.println("Existst Y: " + linkedList.find(new Node("Y")));
		linkedList.erase(new Node("X"));
		linkedList.printLinkedList();
		linkedList.addBefore(new Node("A"), new Node("AA"));
		linkedList.printLinkedList();
		System.out.println("Front Node: " + linkedList.topFront().getValue());
		System.out.println("BacK Node: " + linkedList.topBack().getValue());
		linkedList.addAfter(new Node("AA"), new Node("AAA"));
		linkedList.printLinkedList();
		System.out.println("Front Node: " + linkedList.topFront().getValue());
		System.out.println("BacK Node: " + linkedList.topBack().getValue());
		linkedList.addAfter(new Node("AAasd"), new Node("AAA"));
		linkedList.printLinkedList();
		linkedList.reverseList();
		linkedList.printLinkedList();
		System.out.println("Front Node: " + linkedList.topFront().getValue());
		System.out.println("BacK Node: " + linkedList.topBack().getValue());
		System.out.println("###########REVERSE LIST SECOND APPROACH##########");
		linkedList.printLinkedList();
		linkedList.reverseListSecondAproach();
		linkedList.printLinkedList();
	}
	
}
