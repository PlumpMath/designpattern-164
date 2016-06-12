package com.sxz.dp.singleton;

public enum Singleton4 {
	instance;
	public static Singleton4 getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		Singleton4 obj1=Singleton4.getInstance();
		Singleton4 obj2=Singleton4.getInstance();
		System.out.println(obj1==obj2);
	}

}
