package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface AddBooksDataSer extends Remote{
	
	/**
	 * 系统添加单一持久化对象（账本）
	 * @author YangGuan
	 *
	 */
	public void addBooks(BooksPO po) throws RemoteException;
}
