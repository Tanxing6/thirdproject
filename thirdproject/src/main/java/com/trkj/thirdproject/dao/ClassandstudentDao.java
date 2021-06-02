package com.trkj.thirdproject.dao;

import com.trkj.thirdproject.entity.Classandstudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ClassandstudentDao {
    int deleteByPrimaryKey(Integer classandstudentId);

    int insert(Classandstudent record);
    //新增
    int insertSelective(Classandstudent record);

    Classandstudent selectByPrimaryKey(Integer classandstudentId);

    int updateByPrimaryKeySelective(Classandstudent record);

    int updateByPrimaryKey(Classandstudent record);
    //查询所以
    List<Classandstudent> findAll(String Name,String Phone);



}