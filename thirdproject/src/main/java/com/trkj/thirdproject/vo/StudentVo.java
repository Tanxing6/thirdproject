package com.trkj.thirdproject.vo;

import lombok.Data;

import java.util.Date;
@Data
public class StudentVo {
    /**
     * 学生编号
     */
    private Integer studentId;

    /**
     * 学生名称
     */
    private String studentName;

    /**
     * 学生状态
     */
    private Integer studentState;

    /**
     * 班级编号
     */
    private Integer classesId;

    /**
     * 生源渠道编号
     */
    private Integer sourceId;

    /**
     * 咨询登记编号
     */
    private Integer registerId;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系电话
     */
    private String studentPhone;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 照片地址
     */
    private String imgaddress;

    /**
     * 家长姓名
     */
    private String parentname;

    /**
     * 家长电话
     */
    private String parentphone;

    /**
     * 学号
     */
    private String studentNumber;

    /**
     * 入学备注
     */
    private String entrance;

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

    /**
     * 就读时间
     */
    private Date studytime;

}
