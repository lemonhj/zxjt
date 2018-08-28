package com.abcdpower.riskcontrol.zxjt.service.impl;


import com.abcdpower.riskcontrol.zxjt.dao.MortgageChangeInfoMapper;
import com.abcdpower.riskcontrol.zxjt.entity.MortgageChangeInfo;
import com.abcdpower.riskcontrol.zxjt.service.IMortgageChangeInfoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:实现类
 * @author 
 * @version 1.0
 * @created 
 */
@Service(value="mortgageChangeInfoService")
public class MortgageChangeInfoServiceImpl extends BaseServiceImpl<MortgageChangeInfo,MortgageChangeInfoMapper> implements IMortgageChangeInfoService,InitializingBean {

	@Autowired
	private MortgageChangeInfoMapper mortgageChangeInfoMapper;
	
	public void afterPropertiesSet() throws Exception {
		this.setBaseMapper(mortgageChangeInfoMapper);
	}

}
