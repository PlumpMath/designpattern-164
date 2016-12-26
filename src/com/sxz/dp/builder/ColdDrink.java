/**
 * 
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public abstract class ColdDrink implements Item {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#price()
	 */
	@Override
	public abstract Float price();

}
