package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.BussinessOrgBLSer;
import vo.orgVO.BussinessOrgVO;
import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BusinessBL implements BussinessOrgBLSer {

	@Override
	public String[] getBussinessmanList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getCourierList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addCourier(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeCourier(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getVehicleList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public VehicleVO getVehicleInfo(String codeVehicle) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addVehicle(VehicleVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeVehicle(String codeVehicle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeVehicle(VehicleVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getDriverList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public DriverVO getDriverInfo(String codeDriver) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addDriver(DriverVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeDriver(String codeDriver) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeDriver(DriverVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addBussinessHall(BussinessOrgVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessHall(String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeCodeNumber(String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

}
