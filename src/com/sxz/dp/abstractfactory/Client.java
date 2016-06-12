package com.sxz.dp.abstractfactory;

public class Client {

	public static void main(String[] args) {
		//AbstractClotherFactory factory =  new NormalClotherFactory();
		//AbstractClotherFactory factory =  new VogueClotherFactory();
		AbstractClotherFactory factory =  new LuxuryClotherFactory();
		factory.produceClother();
	}

}
