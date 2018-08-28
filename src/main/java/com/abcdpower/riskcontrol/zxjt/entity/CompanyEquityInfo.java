package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 股权出质
 * @version 1.0
 * @date Jun 18, 2007
 */
public class CompanyEquityInfo {

	private Long id;
	
	private Long companyId;
	
	private String base;
	
	private String regNumber;
	
	private String pledgor;
	
	private String certifNumberL;
	
	private String equityAmount;
	
	private String pledgee;
	
	private String certifNumberR;
	
	private Date regDate;
	
	private String state;
	
	private Date putDate;
	
	private String changeSituation;
	
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
	
	public String getRegNumber() {
		return this.regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	public String getPledgor() {
		return this.pledgor;
	}

	public void setPledgor(String pledgor) {
		this.pledgor = pledgor;
	}
	
	public String getCertifNumberL() {
		return this.certifNumberL;
	}

	public void setCertifNumberL(String certifNumberL) {
		this.certifNumberL = certifNumberL;
	}
	
	public String getEquityAmount() {
		return this.equityAmount;
	}

	public void setEquityAmount(String equityAmount) {
		this.equityAmount = equityAmount;
	}
	
	public String getPledgee() {
		return this.pledgee;
	}

	public void setPledgee(String pledgee) {
		this.pledgee = pledgee;
	}
	
	public String getCertifNumberR() {
		return this.certifNumberR;
	}

	public void setCertifNumberR(String certifNumberR) {
		this.certifNumberR = certifNumberR;
	}
	
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Date getPutDate() {
		return this.putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	
	public String getChangeSituation() {
		return this.changeSituation;
	}

	public void setChangeSituation(String changeSituation) {
		this.changeSituation = changeSituation;
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
