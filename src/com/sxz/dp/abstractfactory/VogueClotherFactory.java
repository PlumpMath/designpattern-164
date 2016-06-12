/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class VogueClotherFactory extends AbstractClotherFactory {
	IBrand brand;
	IButton button;
	IMaterial material;
	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.AbstractClotherFactory#produceClother()
	 */
	@Override
	public void produceClother() {
		brand = new VogueBrand();
		brand.produceBrand();
		button = new VogueButton();
		button.produceButton();
		material=new VogueMaterial();
		material.produceMaterial();

	}

}
