package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 动产抵押-变更
 * @version 1.0
 * @date Jun 18, 2007
 */
public class MortgageChangeInfo {

	private Long id;
	
	private Long companyId;
	
	private Long mortgageId;
	
	private Date changeDate;
	
	private String changeContent;
	
	private Date createTime;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	public Long getMortgageId() {
		return this.mortgageId;
	}

	public void setMortgageId(Long mortgageId) {
		this.mortgageId = mortgageId;
	}
	
	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
	
	public String getChangeContent() {
		return this.changeContent;
	}

	public void setChangeContent(String changeContent) {
		this.changeContent = changeContent;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
