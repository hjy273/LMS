package dataservice.organizationdataservice;

import po.orgPO.MiddleOrgPO;


public interface MiddleOrgDataSer {
	/**
	 * 获得业务员列表
	 * @return 业务员的ID+name列表
	 */
	public String[] getBussinessmanList();
	
	/**
	 * 增加一个业务员
	 * @param ID 欲增加的业务员账号
	 * @return 操作是否成功的信息
	 */
	public boolean addBussinessman(long ID);
	
	/**
	 * 删除一个业务员
	 * @param ID 要删除的业务员的账号
	 * @return 操作是否成功的信息
	 */
	public boolean removeBussinessman(long ID);

	/**
	 * 获得仓库管理员列表
	 * @return 仓库管理员的ID+name列表
	 */
	public String[] getStorgerList();
	/**
	 * 增加一个仓库管理员
	 * @param ID 欲增加的业务员账号
	 * @return 操作是否成功的信息
	 */
	public boolean addStorger(long ID);
	
	/**
	 * 删除一个仓库管理员
	 * @param ID 要删除的仓库管理员的账号
	 * @return 操作是否成功的信息
	 */
	public boolean removeStorger(long ID); 
	
	/**
	 * 获得下辖营业厅列表
	 * 
	 * 注意：中转中心没有增加营业厅功能，这要通过新建营业厅时选择所属中转中心实现，详见BussinessOrgDataSer.addBussinessHall(BussinessOrgVO vo)
	 * 中转中心也没有删除营业厅功能，这要通过删除营业厅时实现，详见BussinessOrgDataSer.removeBussinessHall(BussinessOrgVO vo)
	 * @return city+codeNumber列表
	 */
	public String[] getBussinessHallList();
	
	
	/**
	 * 返回机构其他信息，即城市和编号
	 * @return city+codeNumber
	 */
	
	public String GetInfo();
	
	/**
	 * 修改中转中心所在城市    
	 * 修改后要先删除原有城市在添加现在的城市
	 * @param city 欲修改的城市
	 * @return 操作是否成功的信息
	 */
	public boolean changeCity(String city);
	
	/**
	 * 新增一个中转中心
	 * @param vo 欲创建的中转中心机构信息
	 * @return 操作是否成功的信息
	 */
	public boolean addMiddleOrg(MiddleOrgPO po);
	
	/**
	 * 删除一个中转中心
	 * 
	 * 注：没看到有修改机构信息的方法吧？机构的城市和编号不能修改，修改机构通过增减业务员、仓库管理员和下辖机构表现
	 * @param codeNumber 欲删除的中转中心的机构编号
	 * @return 操作是否成功的信息
	 */
	public boolean removeMiddleOrg(String codeNumber);
	

}
