/**
 * 
 */
package com.sxz.dp.nullobject;

/**
 * @author BG243085
 *	实体类
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

}
