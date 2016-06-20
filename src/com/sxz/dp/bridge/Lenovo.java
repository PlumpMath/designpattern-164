/**
 *  联想牌
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Lenovo extends Brand{
	public Lenovo() {
		super.name="联想牌";
	}
	/* (non-Javadoc)
	 * @see com.sxz.dp.bridge.Brand#showBrand()
	 */
	@Override
	public String showBrand() {
		return super.name;
	}
}
