package by.htp.run;



import java.util.LinkedList;

import by.htp.LinkedList.MyLinkedList;

public class MainApp {
public static void main(String[] args) {
	MyLinkedList<String> ll=new MyLinkedList<>();
	MyLinkedList<String> ll3=new MyLinkedList<>();
	ll.add("One");
	ll.add("Two");
	ll.add("Three");
	ll.add("Four");
	ll.add("Five");
	
	System.out.println(ll.size());
	System.out.println(ll3.size());
	System.out.println(ll.get(3));

	System.out.println();
	
	
	
}
}
