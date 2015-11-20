package vo.documentsVO;


import businesslogic.state.ModeofTrans;

public class OutbillsVO  extends DocumentVO{
	private String code;//出库单编号
	private String doName;//单据名
	private String packCode;//快递编号
	private String date;//出库日期
	private String account;//创建人账号
	private String arrival;//目的地
	private ModeofTrans Mode;//装运形式
	private String transCode;//汽运编号
	
	public OutbillsVO(String code, String doName, String packCode, String date,String account,
			String arrival, ModeofTrans mode, String transCode) {
		super();
		this.code = code;
		this.doName = doName;
		this.packCode = packCode;
		this.date = date;
		this.account=account;
		this.arrival = arrival;
		Mode = mode;
		this.transCode = transCode;
	}
	
	public String getAcccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDoName() {
		return doName;
	}

	public void setDoName(String doName) {
		this.doName = doName;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPackCode() {
		return packCode;
	}
	public void setPackCode(String packCode) {
		this.packCode = packCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public ModeofTrans getMode() {
		return Mode;
	}
	public void setMode(ModeofTrans mode) {
		Mode = mode;
	}
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
}
