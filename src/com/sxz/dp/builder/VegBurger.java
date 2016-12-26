/**
 * 蔬菜汉堡
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#name()
	 */
	@Override
	public String name() {
		return "Veg Burger";
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Burger#price()
	 */
	@Override
	public Float price() {
		return 20.5F;
	}

}
