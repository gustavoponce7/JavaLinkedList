package com.datastructure.linkedlist;

public class CustomLinkedList {

	private Node head;
	private Node tail;

	// add a new element in the first place of the list
	public void pushFront(Node node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			Node temp = head;
			this.head = node;
			node.setNextNode(temp);
		}
	}

	// add a new element in the last place of the list using tail as a reference
	public void pushBackUsingTail(Node node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.setNextNode(node);
			this.tail = node;
		}
	}

	// add a new element in the last place of the list using iteration (not
	// recommended)
	public void pushBackUsingIteration(Node node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			Node temp = head;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(node);
			this.tail = node;
		}
	}

	// Removes the first element
	public void popFront() {
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node temp = head.getNextNode();
			if (temp == null) {
				this.head = null;
				this.tail = null;
			} else {
				this.head = temp;
			}
		}

	}

	// Removes the last element
	public void popBack() {
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node temp = head;
			Node previousNode = null;
			while (temp.getNextNode() != null) {
				previousNode = temp;
				temp = temp.getNextNode();
			}
			if (previousNode == null) {
				this.head = null;
				this.tail = null;
			} else {
				previousNode.setNextNode(null);
				this.tail = previousNode;
			}

		}
	}

	// Verify if the linked list is empty
	public boolean isEmpty() {
		if (this.head == null) {
			return true;
		} else {
			return false;
		}
	}

	// Print the linked list values
	public void printLinkedList() {
		System.out.println("### LinkedList Values ###");
		if (isEmpty()) {
			System.out.println("LinkedList Empty");
		} else {
			Node temp = head;
			String coma = "";
			while (temp != null) {
				System.out.print(coma + temp.getValue());
				coma = ", ";
				temp = temp.getNextNode();
			}
			System.out.println();
		}
	}

	// Get the first element in the list
	public Node topFront() {
		return head;
	}

	// Get the last element in the list
	public Node topBack() {
		return tail;
	}

	// Verify if the node value exists in the list
	public boolean find(Node node) {
		Node temp = head;

		while (temp != null) {
			if (temp.getValue().equals(node.getValue())) {
				return true;
			}
			temp = temp.getNextNode();
		}
		return false;
	}

	// Erase the first node found with the value provided
	public void erase(Node node) {
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			System.out.println("Trying to find and erase the value: " + node.getValue());
			Node temp = head;
			Node previousNode = null;

			while (temp.getNextNode() != null) {
				previousNode = temp;
				temp = temp.getNextNode();
				if (temp.getValue().equals(node.getValue())) {
					break;
				}
			}
			previousNode.setNextNode(temp.getNextNode());
			if (temp.getNextNode() == null) {
				this.tail = previousNode;
			}

		}
	}

	// Add before a value in the list
	public void addBefore(Node before, Node node) {
		boolean found = false;
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			System.out.println("Trying to add a node before: " + before.getValue() + " with value: " + node.getValue());
			Node temp = head;
			Node previousNode = null;

			while (temp.getNextNode() != null) {
				previousNode = temp;
				temp = temp.getNextNode();
				if (temp.getValue().equals(before.getValue())) {
					found = true;
					break;
				}
			}
			if (found) {
				previousNode.setNextNode(node);
				node.setNextNode(temp);
			} else {
				System.out.println("Node reference doesn't exist in the list: " + before.getValue());
			}

		}
	}

	// Add After a value in the list
	public void addAfter(Node after, Node node) {
		boolean found = false;
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			System.out.println("Trying to add a node after: " + after.getValue() + " with value: " + node.getValue());
			Node temp = head;

			while (temp != null) {
				if (temp.getValue().equals(after.getValue())) {
					found = true;
					break;
				}
				temp = temp.getNextNode();
			}

			if (found) {
				if (temp.getNextNode() == null) {
					temp.setNextNode(node);
					this.tail = node;
				} else {
					Node nextNode = temp.getNextNode();
					temp.setNextNode(node);
					node.setNextNode(nextNode);
				}
			} else {
				System.out.println("Node reference doesn't exist in the list: " + after.getValue());
			}
		}
	}

	// Reverse the values from the linked list
	public void reverseList() {
		if (isEmpty() || this.head == null) {
			System.out.println("Empty Linked List");
		} else {
			Node node1 = head;
			Node node2 = node1.getNextNode();

			head.setNextNode(null);
			this.tail = head;
			while (node1 != null && node2 != null) {
				Node aux = node2.getNextNode();
				node2.setNextNode(node1);
				node1 = node2;
				node2 = aux;
			}
			this.head = node1;

		}
	}
}
