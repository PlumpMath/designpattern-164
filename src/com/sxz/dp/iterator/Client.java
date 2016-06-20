/**
 * 迭代器模式实际应用场景中不多，基本就是应用与JAVA类库中的集合类中，其基本思想就是采用内部类
 * 去实现接口方法，采用内部类的好处就是可以直接访问外部类属性，并且可以不对外暴露内部类信息。
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
