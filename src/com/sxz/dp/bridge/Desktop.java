/**
 *  台式电脑
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Desktop extends Computer{
	private Brand brand; 
	
	public Desktop(Brand brand) {
		super();
		this.brand = brand;
	}


	@Override
	public void sell() {
		System.out.println("卖出的是"+this.brand.showBrand()+"台式电脑");
		
	}

}
