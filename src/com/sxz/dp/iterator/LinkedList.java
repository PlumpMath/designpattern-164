/**
 * 
 */
package com.sxz.dp.iterator;

/**
 * @author BG243085
 *
 */
public class LinkedList<T> implements Collection<T>{
	private Node<T> head=null;
	private Node<T> tail=null;
	private int size;
	public LinkedList(){
		head=new Node<T>();
		tail=new Node<T>();
		head.setPrevious(null);
		head.setNext(tail);
	    tail.setNext(null);
	    tail.setPrevious(head);
	}
	@Override
	public void add(T obj) {
		if(head.getNext()==tail){//ø’¡¥±Ì
			Node<T> node=new Node<T>(obj,tail,head);
			head.setNext(node);
			tail.setPrevious(node);
		}else{
 			Node<T> node=new Node<T>(obj,tail,tail.getPrevious());
 			tail.getPrevious().setNext(node);
			tail.setPrevious(node);
		}
		size++;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>();
	}
	class LinkedListIterator<T> implements Iterator<T>{
		private int index;
		@Override
		public Boolean hasNext() {
			return index<size;
		}

		@Override
		public T next() {
			Node<T> node=(Node<T>) head;
			for(int i=0;i<=index;i++){
				node=node.getNext();
			}
			index++;
			return node.getValue();
		}
		
	}
}
