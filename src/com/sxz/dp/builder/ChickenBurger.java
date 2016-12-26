/**
 * 
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public class ChickenBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#name()
	 */
	@Override
	public String name() {
		return "Chicken Burger";
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Burger#price()
	 */
	@Override
	public Float price() {
		return 50.5F;
	}

}
