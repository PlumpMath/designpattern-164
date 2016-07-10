/**
 * 
 */
package com.sxz.dp.simplefactory;

/**
 * @author BG243085
 *
 */
public class Factory {
	public static ICar produce(String carType){
		ICar car = null;
		if("benz".equalsIgnoreCase(carType)){
			car=new Benz();
		}else if("bmw".equalsIgnoreCase(carType)){
			car = new BMW();
		}else if("geely".equalsIgnoreCase(carType)){
			car=new Geely();
		}else{
			throw new RuntimeException("这类车还没发生产。。。");
		}
		return car;
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ICar car=Factory.produce("benz");
		car.run();

	}

}
