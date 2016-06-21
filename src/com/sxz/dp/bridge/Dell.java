/**
 * 戴尔
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Dell extends Brand {
	public Dell() {
		super.name="戴尔牌";
	}
	/* (non-Javadoc)
	 * @see com.sxz.dp.bridge.Brand#showBrand()
	 */
	@Override
	public String showBrand() {
		return super.name;
	}

}
