/**
 * 实际的 builder 类负责创建 Meal 对象
 */
package com.sxz.dp.builder;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal =new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal(){
		Meal meal =new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
