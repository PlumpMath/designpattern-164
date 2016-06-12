/**
 * 
 */
package com.sxz.dp.abstractfactory;

import java.awt.Button;

/**
 * @author BG243085
 *
 */
public class LuxuryClotherFactory extends AbstractClotherFactory {
	IBrand brand;
	IButton button;
	IMaterial material;
	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.AbstractClotherFactory#produceClother()
	 */
	@Override
	public void produceClother() {
		brand=new LuxuryBrand();
		brand.produceBrand();
		button=new LuxuryButton();
		button.produceButton();
		material=new LuxuryMaterial();
		material.produceMaterial();
	}

}
