package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.documentsdataservice.NotApproved;

public class NotApprovedImpl extends UnicastRemoteObject implements NotApproved{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7300743386580696508L;

	public NotApprovedImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean NotApproved(String code, String doName) {
		// TODO 自动生成的方法存根
		return false;
	}

}
