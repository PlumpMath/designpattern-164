/**
 * 
 */
package com.sxz.dp.abstractfactory;

/**
 * @author BG243085
 *
 */
public class LuxuryBrand implements IBrand {

	/* (non-Javadoc)
	 * @see com.sxz.dp.abstractfactory.IBrand#produceBrand()
	 */
	@Override
	public IBrand produceBrand() {
		System.out.println("�ݳ��·��̱�");
		return new LuxuryBrand();
	}

}
