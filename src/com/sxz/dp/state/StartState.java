/**
 * 
 */
package com.sxz.dp.state;

/**
 * @author BG243085
 *
 */
public class StartState implements State {
	
	/* (non-Javadoc)
	 * @see com.sxz.dp.state.State#doAction(com.sxz.dp.state.Context)
	 */
	@Override
	public void doAction(Context context) {
		context.setState(this);
		System.out.println("start state doaction...");
	}
	public String toString(){
		return "StartState";
	}
}
