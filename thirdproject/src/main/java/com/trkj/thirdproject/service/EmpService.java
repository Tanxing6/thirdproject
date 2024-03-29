package com.trkj.thirdproject.service;

import com.trkj.thirdproject.entity.Emp;

import java.util.List;

public interface EmpService {
    //新增
    Emp insert(Emp record);
    //查询
    List<Emp> selectAllEmp();
//    删除
    void delectEmp(Integer EmpId);
    //修改
    Emp updateEmp(Emp emp);
    //模糊查询
    List<Emp> findalls(String empname,String empsex);
}
