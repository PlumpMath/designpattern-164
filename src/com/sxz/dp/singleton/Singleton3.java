package com.sxz.dp.singleton;

public class Singleton3 {
	private static Singleton3 instance;
	private Singleton3(){
		
	}
	static class innerClass{
		public static Singleton3 getInstance(){
			if(instance==null){
				instance=new Singleton3();
			}
			return instance;
		}
	}
	public static void main(String []args){
		Singleton3 obj1= Singleton3.innerClass.getInstance();
		Singleton3 obj2= Singleton3.innerClass.getInstance();
		System.out.println(obj1==obj2);
	}
	
}
