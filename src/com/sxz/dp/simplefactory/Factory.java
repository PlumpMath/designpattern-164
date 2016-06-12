package com.sxz.dp.simplefactory;

public class Factory {
	public static ICar produceCar(String brand){
		ICar car =null;
		if("benz".equals(brand)){
			car = new Benz();
		}else if("bmw".equals(brand)){
			car=new BMW();
		}else if("Gerry".equals(brand)){
			car=new Gerry();
		}
		return car;
	}
	public static void main(String []args){
		ICar car = Factory.produceCar("benz");
		car.run();
	}
}
