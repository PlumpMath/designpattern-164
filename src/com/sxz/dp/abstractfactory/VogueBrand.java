/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class VogueBrand implements IBrand{

	@Override
	public IBrand produceBrand() {
		System.out.println("�����·��̱�");
		return new VogueBrand();
	}

}
