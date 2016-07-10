/**
 * 糖果机的状态
 */
package com.sxz.dp.staticproxy;

import java.io.Serializable;

/**
 * @author shenxianzhong
 *
 */
public interface State extends Serializable {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
