/**
 * 
 */
package com.sxz.dp.iterator;

/**
 * @author BG243085
 *
 */
public class Client {
	public static void main(String[] args) {
		Collection<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		Iterator<Integer>iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	

}
