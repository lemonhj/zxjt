package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 股东股权变更信息
 * @version 1.0
 * @date Jun 18, 2007
 */
public class ReportEquityChangeInfo {

	private Long id;
	
	private Long annualreportId;
	
	private String investorName;
	
	private String ratioBefore;
	
	private String ratioAfter;
	
	private Date changeTime;
	
	private Date createtime;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAnnualreportId() {
		return this.annualreportId;
	}

	public void setAnnualreportId(Long annualreportId) {
		this.annualreportId = annualreportId;
	}
	
	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	
	public String getRatioBefore() {
		return this.ratioBefore;
	}

	public void setRatioBefore(String ratioBefore) {
		this.ratioBefore = ratioBefore;
	}
	
	public String getRatioAfter() {
		return this.ratioAfter;
	}

	public void setRatioAfter(String ratioAfter) {
		this.ratioAfter = ratioAfter;
	}
	
	public Date getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
