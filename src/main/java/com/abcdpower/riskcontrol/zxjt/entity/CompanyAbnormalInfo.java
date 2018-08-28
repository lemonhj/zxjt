package com.abcdpower.riskcontrol.zxjt.entity;

import java.util.Date;

/**
 * @author lin.tb lin.maple.leaf@gmail.com
 * @ClassName: CompanyAbnormalInfo
 * @Description:经营异常
 * @date 2018/8/28
 */
public class CompanyAbnormalInfo {

    /*
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `company_id` bigint(20) DEFAULT NULL COMMENT '公司id',
  `put_reason` varchar(4091) DEFAULT NULL COMMENT '列入异常名录原因',
  `put_date` datetime DEFAULT NULL COMMENT '列入异常名录日期',
  `put_department` varchar(500) DEFAULT NULL COMMENT '决定列入异常名录部门(作出决定机关)',
  `remove_reason` varchar(4091) DEFAULT NULL COMMENT '移除异常名录原因',
  `remove_date` datetime DEFAULT NULL COMMENT '移除异常名录日期',
  `remove_department` varchar(200) DEFAULT NULL COMMENT '决定移除异常名利部门',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `deleted` smallint(6) DEFAULT '0' COMMENT '0：未删除 1：删除',
     */

    private int id;
    private int companyId;
    private String putReason;
    private Date putDate;
    private String putDepartment;

    private String removeReason;


}
