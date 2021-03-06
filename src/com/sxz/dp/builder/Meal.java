package com.sxz.dp.builder;

import java.util.ArrayList;
import java.util.List;


public class Meal {
	private List<Item> items= new ArrayList<Item>();
	public void addItem(Item item){
		this.items.add(item);
	}
	public float getCost(){
		float cost=0.0f;
		for(Item item:items){
			cost+=item.price();
		}
		return cost;
	}
	public void showItems(){
		for(Item item:items){
			System.out.println("item:"+item.name());
			System.out.println(", Packing:"+item.packing());
			System.out.println(", Price"+item.price());
		}
	}
}
