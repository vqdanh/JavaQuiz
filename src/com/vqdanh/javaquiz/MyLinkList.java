package com.vqdanh.javaquiz;

public class MyLinkList {
	private Node first;
	public MyLinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(int value){
		Node newNode = new Node(value);
		newNode.setNext(first);
		first = newNode;
	}
	
	public void deleteLastNode() {
		if(isEmpty())
			return;
		first = first.getNext();
	}
	
	public void deleteNode(Node node){
		Node nextNode = node.getNext();
		if(nextNode != null){
			node.setValue(nextNode.getValue());
			node.setNext(nextNode.getNext());
		} else {
			node = null;
		}
	}
	
	public void deleteNodeGreaterThan(int value) {
		if(isEmpty()){
			return;
		}
		Node temp = first;
		while (temp != null) {
			if(temp.getValue() > value){
				deleteNode(temp);
			} else {
				temp = temp.getNext();
			}
		}
		
	}
	
	public void  print() {
		System.out.println("Values: ");
		Node cur = this.first;
		while (cur != null) {
			cur.print();
			cur = cur.getNext();
		}
	}
	
}
