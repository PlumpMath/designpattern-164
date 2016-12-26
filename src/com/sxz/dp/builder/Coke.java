/**
 * 
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#name()
	 */
	@Override
	public String name() {
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.ColdDrink#price()
	 */
	@Override
	public Float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
