package vo.documentsVO;

public class InBillsVO  extends DocumentVO{
	private String code;//入库单编号
	private String doName;//单据名
	private String InDepotNum; //入库快递编号
	private String InDepotDate; //入库日期
	private String name;//创建人姓名
	private String Destination; // 目的地
	private int AreaNum; //区号
	private int RowNum; //排号
	private int ShelvesNum;  //架号
	private int SositionNum; //位号
	

	public InBillsVO(String code, String doName, String inDepotNum,
			String inDepotDate, String name, String destination, int areaNum,
			int rowNum, int shelvesNum, int sositionNum) {
		super();
		this.code = code;
		this.doName = doName;
		InDepotNum = inDepotNum;
		InDepotDate = inDepotDate;
		this.name=name;
		Destination = destination;
		AreaNum = areaNum;
		RowNum = rowNum;
		ShelvesNum = shelvesNum;
		SositionNum = sositionNum;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
	public String getInDepotNum() {
		return InDepotNum;
	}


	public void setInDepotNum(String inDepotNum) {
		InDepotNum = inDepotNum;
	}


	public String getInDepotDate() {
		return InDepotDate;
	}


	public void setInDepotDate(String inDepotDate) {
		InDepotDate = inDepotDate;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}



	public int getAreaNum() {
		return AreaNum;
	}



	public void setAreaNum(int areaNum) {
		AreaNum = areaNum;
	}



	public int getRowNum() {
		return RowNum;
	}



	public void setRowNum(int rowNum) {
		RowNum = rowNum;
	}



	public int getShelvesNum() {
		return ShelvesNum;
	}



	public void setShelvesNum(int shelvesNum) {
		ShelvesNum = shelvesNum;
	}



	public int getSositionNum() {
		return SositionNum;
	}



	public void setSositionNum(int sositionNum) {
		SositionNum = sositionNum;
	}


}
