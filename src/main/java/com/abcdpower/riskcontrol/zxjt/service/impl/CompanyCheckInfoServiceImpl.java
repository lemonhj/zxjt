package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyCheckInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyCheckInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyCheckInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyCheckInfoService")
public class CompanyCheckInfoServiceImpl extends BaseServiceImpl<CompanyCheckInfo,CompanyCheckInfoMapper> implements ICompanyCheckInfoService,InitializingBean {

	@Autowired
	private CompanyCheckInfoMapper companyCheckInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyCheckInfoMapper);
	}

}
