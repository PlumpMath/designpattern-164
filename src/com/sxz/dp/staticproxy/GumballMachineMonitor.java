package com.sxz.dp.staticproxy;

import java.rmi.RemoteException;

public class GumballMachineMonitor {
	GumballMachineRemote machine;
	public GumballMachineMonitor(GumballMachineRemote machine){
		this.machine=machine;
	}
	public void report() throws RemoteException{
		System.out.println("GumballMachine:"+machine.getLocation());
		System.out.println("Current inventory:"+machine.getCount()+" gumballs");
		System.out.println("Current state:"+machine.getLocation());

	}
}
