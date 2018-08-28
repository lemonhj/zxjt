package com.abcdpower.riskcontrol.zxjt.entity;


import java.util.Date;


/**
 * 行政处罚
 * @version 1.0
 * @date Jun 18, 2007
 */
public class CompanyPunishmentInfo {

	private Long id;
	
	private Long companyId;
	
	private String base;
	
	private String punishNumber;
	
	private String name;
	
	private String regNumber;
	
	private String legalPersonName;
	
	private String type;
	
	private String content;
	
	private String departmentName;
	
	private Date decisionDate;
	
	private Date publishDate;
	
	private String description;
	
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
	
	public String getPunishNumber() {
		return this.punishNumber;
	}

	public void setPunishNumber(String punishNumber) {
		this.punishNumber = punishNumber;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRegNumber() {
		return this.regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Date getDecisionDate() {
		return this.decisionDate;
	}

	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
