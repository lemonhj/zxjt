package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.ReportChangeRecordMapper;
import com.abcdpower.riskcontrol.zxjt.entity.ReportChangeRecord;
import com.abcdpower.riskcontrol.zxjt.service.IReportChangeRecordService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="reportChangeRecordService")
public class ReportChangeRecordServiceImpl extends BaseServiceImpl<ReportChangeRecord,ReportChangeRecordMapper> implements IReportChangeRecordService,InitializingBean {

	@Autowired
	private ReportChangeRecordMapper reportChangeRecordMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(reportChangeRecordMapper);
	}

}
