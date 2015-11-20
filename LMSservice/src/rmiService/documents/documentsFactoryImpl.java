package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.documentsdataservice.NotApproved;
import dataservice.documentsdataservice.addDocummentInfoDataSer;
import dataservice.documentsdataservice.deleteDataSer;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getBufferedCodeDataSer;
import dataservice.documentsdataservice.getBufferedInfoDataSer;
import dataservice.documentsdataservice.getCodeDataSer;
import dataservice.documentsdataservice.getDocumentInfoDataSer;
import dataservice.documentsdataservice.getNotPassDocCode;

public class documentsFactoryImpl extends UnicastRemoteObject implements documentsFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2425119006902233918L;

	public documentsFactoryImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public addDocummentInfoDataSer createaddDocummentInfoDataSer()
			throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public deleteDataSer createDeleteDataSer() throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public getBufferedCodeDataSer createGetBudderedCodeDataSer()
			throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public getBufferedInfoDataSer createGetBufferedInfoDataSer()
			throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public getCodeDataSer createGetCodeDataSer() throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public getDocumentInfoDataSer createGetDocumentInfoDataSer()
			throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public getNotPassDocCode createGetNotPassDocCode() throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public NotApproved createNotApproved() throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}



}
