/**
 * 
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public class Pepsi extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#name()
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.ColdDrink#price()
	 */
	@Override
	public Float price() {
		return 35.0f;
	}

}
