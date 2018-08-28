package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.ReportEquityChangeInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.ReportEquityChangeInfo;
import com.abcdpower.riskcontrol.zxjt.service.IReportEquityChangeInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="reportEquityChangeInfoService")
public class ReportEquityChangeInfoServiceImpl extends BaseServiceImpl<ReportEquityChangeInfo,ReportEquityChangeInfoMapper> implements IReportEquityChangeInfoService,InitializingBean {

	@Autowired
	private ReportEquityChangeInfoMapper reportEquityChangeInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(reportEquityChangeInfoMapper);
	}

}
