/**
 * 糖果机，可以让我们得到糖果数量，取得糖果机的状态以及糖果机的位置。
 */
package com.sxz.dp.staticproxy;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author shenxianzhong
 *
 */
public interface GumballMachineRemote extends Remote {
	/**
	 * 获得糖果数量
	 * @return
	 * @throws RemoteException
	 */
	int getCount()throws RemoteException;
	/**
	 * 获得糖果机的位置
	 * @return
	 * @throws RemoteException
	 */
	String getLocation()throws RemoteException;
	
	/***
	 * 获得糖果机的状态
	 * @return
	 * @throws RemoteException
	 */
	State getState()throws RemoteException;
}
