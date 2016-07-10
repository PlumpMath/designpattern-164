/**
 * 
 */
package com.sxz.dp.staticproxy;

/**
 * @author shenxianzhong
 *
 */
public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	/* (non-Javadoc)
	 * @see com.sxz.dp.staticproxy.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.staticproxy.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.staticproxy.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.sxz.dp.staticproxy.State#dispense()
	 */
	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
