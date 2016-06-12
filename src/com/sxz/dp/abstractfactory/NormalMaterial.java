/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class NormalMaterial implements IMaterial {

	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.IMaterial#produceMaterial()
	 */
	@Override
	public IMaterial produceMaterial() {
		System.out.println("普通衣服面料");
		return new NormalMaterial();
	}

}
