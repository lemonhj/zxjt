package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.CompanyPunishmentInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.CompanyPunishmentInfo;
import com.abcdpower.riskcontrol.zxjt.service.ICompanyPunishmentInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="companyPunishmentInfoService")
public class CompanyPunishmentInfoServiceImpl extends BaseServiceImpl<CompanyPunishmentInfo,CompanyPunishmentInfoMapper> implements ICompanyPunishmentInfoService,InitializingBean {

	@Autowired
	private CompanyPunishmentInfoMapper companyPunishmentInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(companyPunishmentInfoMapper);
	}

}
