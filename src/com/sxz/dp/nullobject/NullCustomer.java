/**
 * 
 */
package com.sxz.dp.nullobject;

/**
 * @author BG243085
 *
 */
public class NullCustomer extends AbstractCustomer {
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}
