/**
 * 懒汉式双重验证机制单例模式、
 */
package com.sxz.dp.singleton;

/**
 * @author BG243085
 *
 */
public class Singleton2 {
	private volatile static Singleton2 instance;
	private Singleton2(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	public static Singleton2 getInstance(){
		if(instance==null){
			synchronized (Singleton2.class) {
				if(instance==null){
					instance=new Singleton2();
				}
			}
		}
		return instance;
	}
	
	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Singleton2 obj1=Singleton2.getInstance();
		Singleton2 obj2=Singleton2.class.newInstance();
		System.out.println(obj1==obj2);
	}

}
