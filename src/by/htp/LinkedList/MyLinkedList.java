package by.htp.LinkedList;

public class MyLinkedList<T> {
	Entry<T> header;
	
	
	public MyLinkedList() {
		super();
		Entry<T> header= new Entry<>();
		header.setLast(header);
		header.setNext(header);
		this.header = header;
	}
	public void add(T t) {
		Entry<T> newEntry=new Entry<>();
		newEntry.setVal(t);
		header.getNext().setLast(newEntry);
		newEntry.setNext(header.getNext());
		newEntry.setLast(header);
		header.setNext(newEntry);
		
		
	}
	public void addFirst(T t) {
		Entry<T> newEntry=new Entry<>();
		newEntry.setVal(t);
		header.getNext().setLast(newEntry);
		newEntry.setNext(header.getNext());
		newEntry.setLast(header);
		header.setNext(newEntry);
	}
	
	public void addLast(T t) {
		Entry<T> newEntry=new Entry<>();
		newEntry.setVal(t);
		header.getLast().setNext(newEntry);
		newEntry.setLast(header.getLast());
		newEntry.setNext(header);
		header.setLast(newEntry);
	}
	
	public T get(int index) {
		int count=0;
		Entry<T> temp=header;
		while(count<=index) {
			temp=temp.getNext();
			if (temp==header) {
				System.out.println("Index is greater than the length of the list ");
				throw new ArrayIndexOutOfBoundsException();
			}
			count++;
		}
		return temp.getVal();
	}
	public int size() {
		int count=0;
		Entry<T> temp=header.getNext();
		while(temp!=header) {
			temp=temp.getNext();	
			count++;
		}
		return count;
		
	}
	public void set(int index, T val) {
		int count=0;
		Entry<T> temp=header;
		while(count<=index) {
			temp=temp.getNext();
			if (temp==header) {
				System.out.println("Index is greater than the length of the list ");
				throw new ArrayIndexOutOfBoundsException();
			}
			count++;
		}
		temp.setVal(val);;
	}
	
	public void removeFirst() {
		header.setNext(header.getNext().getNext());
		header.getNext().setLast(header);
		
	}
	public void removelast() {
		header.setLast(header.getLast().getLast());
		header.getLast().setNext(header);
		
	}
	
	
	
	
	}
	








