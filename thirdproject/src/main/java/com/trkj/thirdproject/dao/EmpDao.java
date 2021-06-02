package com.trkj.thirdproject.dao;

import com.trkj.thirdproject.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmpDao {
    int deleteByPrimaryKey(Integer empId);

    int AddEmp(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    int updateByPrimaryKey(Emp record);
    List<Emp> selectAllEmp();
//模糊查询
List<Emp> findalls(String empname,String empsex);

}