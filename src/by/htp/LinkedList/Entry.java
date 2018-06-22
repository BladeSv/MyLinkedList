package by.htp.LinkedList;



class Entry<T> {
	private T val;
	private Entry<T> next;
	private Entry <T>last;
	

	
	public Entry<T> getNext() {
		return next;
	}
	public void setNext(Entry<T> next) {
		this.next = next;
	}
	public Entry<T> getLast() {
		return last;
	}
	public void setLast(Entry<T> last) {
		this.last = last;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	
}