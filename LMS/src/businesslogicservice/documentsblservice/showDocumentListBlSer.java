package businesslogicservice.documentsblservice;

import java.util.ArrayList;

public interface showDocumentListBlSer {
	/**
	 * 系统返回由单据编号和名称组成的数组
	 * 用于生成单据列表
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> showList(String doName,String startTime,String endTime);
	}
