package com.trkj.thirdproject.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * register
 * @author 
 */
@Data
public class Register implements Serializable {
    /**
     * 咨询登记编号
     */
    private Integer registerId;

    /**
     * 咨询人
     */
    private String consultant;

    /**
     * 咨询人性别
     */
    private String sex;

    /**
     * 生源渠道编号
     */
    private Integer sourceId;

    /**
     * 计划首次回访日期
     */
    private Date planreturnvisit;

    /**
     * 咨询状态
     */
    private Integer attentstate;

    /**
     * 缴费状态
     */
    private Integer paystate;

    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 新增咨询登记职工
     */
    private String addname;

    /**
     * 新增咨询登记当前时间
     */
    private Date addtime;

    /**
     * 咨询内容
     */
    private String consultcontent;

    /**
     * 最后修改人员
     */
    private String lastupdatename;

    /**
     * 最后修改时间
     */
    private Date lastupdatetime;

    /**
     * 删除咨询登记人员
     */
    private String deletename;

    /**
     * 删除咨询登记时间
     */
    private Date deletetime;

    private Integer detailcourseId;

    private Integer courseId;

    private Integer empId;

    /**
     * 学员电话
     */
    private String phone;

    private static final long serialVersionUID = 1L;
}