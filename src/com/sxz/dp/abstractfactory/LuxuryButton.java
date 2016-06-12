/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class LuxuryButton implements IButton {

	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.IButton#produceButton()
	 */
	@Override
	public IButton produceButton() {
		System.out.println("ÉÝ³ÞÒÂ·þÅ¦¿Û");
		return new LuxuryButton();
	}

}
