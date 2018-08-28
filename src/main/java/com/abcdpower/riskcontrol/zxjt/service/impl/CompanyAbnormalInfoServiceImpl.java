package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyAbnormalInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyAbnormalInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyAbnormalInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyAbnormalInfoService")
public class CompanyAbnormalInfoServiceImpl extends BaseServiceImpl<CompanyAbnormalInfo,CompanyAbnormalInfoMapper> implements ICompanyAbnormalInfoService,InitializingBean {

	@Autowired
	private CompanyAbnormalInfoMapper companyAbnormalInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyAbnormalInfoMapper);
	}

}
