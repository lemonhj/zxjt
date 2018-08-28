package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyEquityInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyEquityInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyEquityInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyEquityInfoService")
public class CompanyEquityInfoServiceImpl extends BaseServiceImpl<CompanyEquityInfo,CompanyEquityInfoMapper> implements ICompanyEquityInfoService,InitializingBean {

	@Autowired
	private CompanyEquityInfoMapper companyEquityInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyEquityInfoMapper);
	}

}
