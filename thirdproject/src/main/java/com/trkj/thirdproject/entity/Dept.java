package com.trkj.thirdproject.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    /**
     * 部门编号
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门序列号
     */
    private Integer deptSortnumber;

    /**
     * 上级部门编号
     */
    private Integer superiorsDeptId;

    /**
     * 新增人
     */
    private String addname;

    /**
     * 新增时间
     */
    private Date addtime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}