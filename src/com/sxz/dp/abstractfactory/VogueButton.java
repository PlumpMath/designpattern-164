/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class VogueButton implements IButton {

	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.IButton#produceButton()
	 */
	@Override
	public IButton produceButton() {
		System.out.println("�����·�Ŧ��");
		return new VogueButton();
	}

}
