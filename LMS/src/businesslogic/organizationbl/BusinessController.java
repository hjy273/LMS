package businesslogic.organizationbl;

import vo.orgVO.BussinessOrgVO;

public class BusinessController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getBussinessmanList() {
		// TODO 自动生成的方法存根
		return bBL.getBussinessmanList();
	}


	public boolean addBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return bBL.addBussinessman(ID);
	}


	public boolean removeBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return bBL.removeBussinessman(ID);
	}


	public String[] getCourierList() {
		// TODO 自动生成的方法存根
		return bBL.getCourierList();
	}


	public boolean addCourier(long ID) {
		// TODO 自动生成的方法存根
		return addCourier(ID);
	}


	public boolean removeCourier(long ID) {
		// TODO 自动生成的方法存根
		return bBL.removeCourier(ID);
	}
	
	public boolean addBussinessHall(BussinessOrgVO vo) {
		// TODO 自动生成的方法存根
		return bBL.addBussinessHall(vo);
	}


	public boolean removeBussinessHall(String codeNumber) {
		// TODO 自动生成的方法存根
		return bBL.removeBussinessHall(codeNumber);
	}


	public String getCodeNumber() {
		// TODO 自动生成的方法存根
		return bBL.getCodeNumber();
	}


	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO 自动生成的方法存根
		return bBL.changeCodeNumberOfMiddle(codeNumberOfMiddle);
	}


	public String getInfo() {
		// TODO 自动生成的方法存根
		return bBL.getInfo();
	}


	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return bBL.changeCity(city);
	}


	public boolean changeCodeNumber(String codeNumber) {
		// TODO 自动生成的方法存根
		return bBL.changeCodeNumber(codeNumber);
	}


}
