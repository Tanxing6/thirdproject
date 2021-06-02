package com.trkj.thirdproject.dao;

import com.trkj.thirdproject.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
@Mapper
public interface StudentDao {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);


    Student selectByPrimaryKey(Integer studentId);


    int updateByPrimaryKey(Student record);
    List<Student> selectAllstudent();
    //新增
    int addstudent(Student student);
    //删除
    int delstuTimeness(String delname, Date deltime, Integer studentId);
//    void deletestudent(Integer studentId);
//    修改
    int updatestudent(Student student);
    //模糊查询根据姓名和电话
    List<Student> slectNameAndPhone(String Name,String Phone);
}