/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class NormalButton implements IButton{

	@Override
	public IButton produceButton() {
		System.out.println("��ͨ�·�Ŧ��");
		return new NormalButton();
	}

}
