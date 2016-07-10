/**
 * 
 */
package com.sxz.dp.staticproxy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author shenxianzhong
 *
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	private int count ;
	private String location;
	private State state;
	protected GumballMachine(int count,String location) throws RemoteException {
		super();
		this.count=count;
		this.location=location;
	}

	@Override
	public int getCount() throws RemoteException {
		return count;
	}

	@Override
	public String getLocation() throws RemoteException {
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		return state;
	}
	
	
	public static void main(String []args) throws RemoteException, MalformedURLException, AlreadyBoundException{
		GumballMachineRemote gumballMachine=new GumballMachine(1,args[0]);
		Naming.bind("//"+args[0]+"/gumballmechine", gumballMachine);
		
	}

}
