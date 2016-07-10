/**
 * 茶的冲泡步骤如下：
 *  1.把水煮好；
 *  2.用沸水冲泡茶叶；
 *  3.把茶叶倒进杯子；
 *  4.加柠檬
 */
package com.sxz.dp.template;

/**
 * @author shenxianzhong
 *
 */
public class Tea extends CaffeineBeverage{
	/**
	 * 把水煮沸
	 */
	public void boilWater(){
		System.out.println("Boiling water");
	}
	/**
	 * 把茶倒进杯子
	 */
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	/**
	 *浸泡茶叶
	 */
	@Override
	void brew() {
		System.out.println("steep the tea");
		
	}
	/**
	 * 加柠檬
	 */
	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
		
	}
}
