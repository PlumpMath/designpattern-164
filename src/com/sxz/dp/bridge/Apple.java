/**
 *  苹果牌电脑
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Apple extends Brand {
	public Apple() {
		super.name="苹果牌";
	}
	/* (non-Javadoc)
	 * @see com.sxz.dp.bridge.Brand#showBrand()
	 */
	@Override
	public String showBrand() {
		return super.name;
	}

}
