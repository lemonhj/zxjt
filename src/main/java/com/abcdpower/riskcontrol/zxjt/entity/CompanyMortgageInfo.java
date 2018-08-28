package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 动产抵押
 * @version 1.0
 * @date Jun 18, 2007
 */
public class CompanyMortgageInfo {

	private Long id;
	
	private Long companyId;
	
	private String base;
	
	private String regNum;
	
	private Date regDate;
	
	private Date publishDate;
	
	private String status;
	
	private String regDepartment;
	
	private String type;
	
	private String amount;
	
	private String term;
	
	private String scope;
	
	private String remark;
	
	private String overviewType;
	
	private String overviewAmount;
	
	private String overviewScope;
	
	private String overviewTerm;
	
	private String overviewRemark;
	
	private Date cancelDate;
	
	private String cancelReason;
	
	private Date createTime;
	
	private int deleted;
	
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
	
	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	public String getRegNum() {
		return this.regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRegDepartment() {
		return this.regDepartment;
	}

	public void setRegDepartment(String regDepartment) {
		this.regDepartment = regDepartment;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
	
	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getOverviewType() {
		return this.overviewType;
	}

	public void setOverviewType(String overviewType) {
		this.overviewType = overviewType;
	}
	
	public String getOverviewAmount() {
		return this.overviewAmount;
	}

	public void setOverviewAmount(String overviewAmount) {
		this.overviewAmount = overviewAmount;
	}
	
	public String getOverviewScope() {
		return this.overviewScope;
	}

	public void setOverviewScope(String overviewScope) {
		this.overviewScope = overviewScope;
	}
	
	public String getOverviewTerm() {
		return this.overviewTerm;
	}

	public void setOverviewTerm(String overviewTerm) {
		this.overviewTerm = overviewTerm;
	}
	
	public String getOverviewRemark() {
		return this.overviewRemark;
	}

	public void setOverviewRemark(String overviewRemark) {
		this.overviewRemark = overviewRemark;
	}
	
	public Date getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public int getDeleted() {
		return this.deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
}
