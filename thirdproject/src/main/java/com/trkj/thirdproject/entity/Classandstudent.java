package com.trkj.thirdproject.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * classandstudent
 * @author 
 */
@Data
public class Classandstudent implements Serializable {
    /**
     * 班级学生编号
     */
    private Integer classandstudentId;

    /**
     * 学生编号
     */
    private Integer studentId;
    private List<Student> student;

    /**
     * 班级编号
     */
    private Integer classesId;
    private  List<Classes> classes;

    private static final long serialVersionUID = 1L;
}