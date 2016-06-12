/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class VogueMaterial implements IMaterial {

	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.IMaterial#produceMaterial()
	 */
	@Override
	public IMaterial produceMaterial() {
		System.out.println("流行衣服面料");
		return new VogueMaterial();
	}

}
