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
		System.out.println("流行衣服商标");
		return new VogueBrand();
	}

}
