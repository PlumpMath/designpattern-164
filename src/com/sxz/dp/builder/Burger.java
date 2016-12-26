/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public abstract class Burger implements Item {


	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Item#price()
	 */
	@Override
	public abstract Float price();

}
