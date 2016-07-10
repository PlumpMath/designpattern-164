/**
 * 咖啡的冲泡步骤如下：
 *  1.把水煮好；
 *  2.用沸水冲泡咖啡；
 *  3.把咖啡倒进杯子；
 *  4.加糖和牛奶
 */
package com.sxz.dp.template;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author shenxianzhong
 *
 */
public class Coffee extends CaffeineBeverage{
	
	/**
	 * 把水煮沸
	 */
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	/**
	 * 把咖啡倒进杯子
	 */
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}

	/**
	 * 冲泡咖啡
	 */
	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
		
	}
	/**
	 * 添加牛奶和糖
	 */
	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
		
	}
	public boolean customerWantsCondiments(){
		String answer;
		try {
			answer = getUserInput();
			if(answer.startsWith("y")){
				return true;
			}else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	private String getUserInput() throws IOException{
		String answer=null;
		System.out.println("Would you like milk and sugar with your coffee(y/n)?");
		BufferedReader bReader =new BufferedReader(new InputStreamReader(System.in));
		answer=bReader.readLine();
		if(answer==null){
			return "no";
		}
		return answer;
	}
}
