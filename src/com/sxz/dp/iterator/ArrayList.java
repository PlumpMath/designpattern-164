/**
 * 
 */
package com.sxz.dp.iterator;

/**
 * @author BG243085
 *
 */
public class ArrayList<T> implements Collection<T> {
	private transient Object[] elementData;
	private static final Object[] EMPTY_ELEMENTDATA = {};
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	public ArrayList() {
		this.elementData=new Object[DEFAULT_CAPACITY];
	}
	@Override
	public void add(T obj) {
		//elementData=new Object[DEFAULT_CAPACITY];
		elementData[size]=obj;
		size++;
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayListIterator<T>();
	}
	class ArrayListIterator<T> implements Iterator<T>{
		private int index;
		@Override
		public Boolean hasNext() {
			if(index<size){
				return true;
			}else{
				return false;
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			return (T)elementData[index++];
		}
		
	}
}
