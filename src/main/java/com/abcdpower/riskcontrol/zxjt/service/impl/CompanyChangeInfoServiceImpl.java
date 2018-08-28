package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyChangeInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyChangeInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyChangeInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyChangeInfoService")
public class CompanyChangeInfoServiceImpl extends BaseServiceImpl<CompanyChangeInfo,CompanyChangeInfoMapper> implements ICompanyChangeInfoService,InitializingBean {

	@Autowired
	private CompanyChangeInfoMapper companyChangeInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyChangeInfoMapper);
	}

}
