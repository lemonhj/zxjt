package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyIllegalInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyIllegalInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyIllegalInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyIllegalInfoService")
public class CompanyIllegalInfoServiceImpl extends BaseServiceImpl<CompanyIllegalInfo,CompanyIllegalInfoMapper> implements ICompanyIllegalInfoService,InitializingBean {

	@Autowired
	private CompanyIllegalInfoMapper companyIllegalInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyIllegalInfoMapper);
	}

}
