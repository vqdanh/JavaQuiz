package com.vqdanh.javaquiz;

public class MainApplication {
	public static void main(String[] args) {
		MyLinkList list = new MyLinkList();
		list.insert(1);
		list.insert(2);
		list.insert(20);
		list.insert(10);
		list.insert(7);
		list.insert(8);
		list.print();
		list.deleteNodeGreaterThan(7);
		list.print();
	}
}
