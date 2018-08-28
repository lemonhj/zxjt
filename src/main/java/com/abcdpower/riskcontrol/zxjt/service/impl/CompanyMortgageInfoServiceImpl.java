package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyMortgageInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyMortgageInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyMortgageInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyMortgageInfoService")
public class CompanyMortgageInfoServiceImpl extends BaseServiceImpl<CompanyMortgageInfo,CompanyMortgageInfoMapper> implements ICompanyMortgageInfoService,InitializingBean {

	@Autowired
	private CompanyMortgageInfoMapper companyMortgageInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyMortgageInfoMapper);
	}

}
