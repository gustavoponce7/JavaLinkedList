package com.datastructure.linkedlist;

public class Node {
	
	private String value;
	private Node nextNode;
	
	public Node(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	

}
