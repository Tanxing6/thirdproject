package com.trkj.thirdproject.service;

import com.trkj.thirdproject.entity.Source;
import com.trkj.thirdproject.entity.Student;

import java.util.Date;
import java.util.List;

public interface StudentService {
//    查看所有
    List<Student> selectAllstudent();
//    新增
Student addstudent(Student student);
    //删除
    int delstuTimeness(String delname, Date deltime, Integer studentId);
    //    修改
    Student updatestudent(Student student);

    //查询所有值（生源渠道）
    List<Source> selectalls();
}
