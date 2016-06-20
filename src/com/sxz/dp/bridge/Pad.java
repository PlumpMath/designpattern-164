/**
 *  pad
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Pad extends Computer{
	private Brand brand; 
	
	public Pad(Brand brand) {
		super();
		this.brand = brand;
	}

	@Override
	public void sell() {
		System.out.println("卖出的是"+this.brand.showBrand()+"pad");
		
	}

}
