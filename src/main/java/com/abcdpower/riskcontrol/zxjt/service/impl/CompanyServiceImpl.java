package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyMapper;
import com.abcdpower.riskcontrol.zxjt.entity.Company;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyService")
public class CompanyServiceImpl extends BaseServiceImpl<Company,CompanyMapper> implements ICompanyService,InitializingBean {

	@Autowired
	private CompanyMapper companyMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyMapper);
	}

}
