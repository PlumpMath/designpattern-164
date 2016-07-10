/**
 * 咖啡因饮料冲泡：
 * 1.把水煮沸；
 * 2.泡
 * 3.把饮料倒入被子；
 * 4.加调料(可选)
 */
package com.sxz.dp.template;

/**
 * @author shenxianzhong
 *
 */
public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
		
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	boolean customerWantsCondiments(){
		return true;
	}

}
