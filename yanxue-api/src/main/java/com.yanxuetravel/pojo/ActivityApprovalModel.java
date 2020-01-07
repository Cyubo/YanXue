package com.yanxuetravel.pojo;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true) //链式写法
public class ActivityApprovalModel implements Serializable {
    /**
     * 审批表主键
     */
    private Integer id;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 审批人身份id
     */
    private Integer approverPeopleId;

    /**
     * 审批人类型
     */
    private String approverPeopleType;
    /**
     * 审批人名称
     */
    private String approveName;

    /**
     * 审批时间
     */
    private Date approverTime;

    /**
     * 0无效1有效
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人userid
     */
    private Integer creator;

    /**
     * 更新人userid
     */
    private Integer updator;

    /**
     * 未通过理由
     */
    private String reasonsNotPassed;

    /**
     * 0未通过1已通过
     */
    private Integer approverStatus;

    private static final long serialVersionUID = 1L;

}