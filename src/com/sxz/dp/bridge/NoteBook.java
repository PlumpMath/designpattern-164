/**
 *  笔记本
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class NoteBook extends Computer {
	private Brand brand; 
	
	
	public NoteBook(Brand brand) {
		super();
		this.brand = brand;
	}


	/* (non-Javadoc)
	 * @see com.sxz.dp.bridge.Computer#sell()
	 */
	@Override
	public void sell() {
		System.out.println("卖出的是"+this.brand.showBrand()+"笔记本");

	}

}
