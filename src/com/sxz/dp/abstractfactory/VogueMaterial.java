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
		System.out.println("�����·�����");
		return new VogueMaterial();
	}

}
