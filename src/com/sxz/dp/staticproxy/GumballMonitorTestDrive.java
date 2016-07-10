package com.sxz.dp.staticproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
	public static void main(String []args) throws RemoteException, MalformedURLException, NotBoundException{
		String []location={"rmi://192.168.31.232/gumballmachine",
				"rmi://192.168.31.233/gumballmachine",
				"rmi://192.168.31.234/gumballmachine"};
		GumballMachineMonitor []monitors=new GumballMachineMonitor[location.length];
		for(int i=0;i<location.length;i++){
			GumballMachineRemote machineRemote=(GumballMachineRemote)Naming.lookup(location[i]);
			monitors[i]=new GumballMachineMonitor(machineRemote);
			System.out.println(monitors[i]);
		}
		for(int i=0;i<location.length;i++){
			monitors[i].report();
		}
	}
}
