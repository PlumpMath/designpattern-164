/**
 * 
 */
package com.sxz.dp.state;

/**
 * @author BG243085
 *
 */
public class StateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		State startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		State closedState = new ClosedState();
		
		closedState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
