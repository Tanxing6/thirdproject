package com.trkj.thirdproject.service;

import com.trkj.thirdproject.entity.Classandstudent;

import java.util.List;

public interface ClassAndStudentService {
    //查询所以
    List<Classandstudent> findAll(String Name, String Phone);
}
