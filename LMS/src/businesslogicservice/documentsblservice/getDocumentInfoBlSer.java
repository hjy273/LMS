package businesslogicservice.documentsblservice;

import vo.documentsVO.DocumentVO;

public interface getDocumentInfoBlSer {
	/**
	 * 系统返回一个完整的VO对象
	 * 用于显示单据的完整信息
	 * @author XiongKaiQi
	 *
	 */
	public DocumentVO getDocumentInfo(String code);
}
