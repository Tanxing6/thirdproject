package com.trkj.thirdproject.service;

import com.trkj.thirdproject.dao.ClassandstudentDao;
import com.trkj.thirdproject.entity.Classandstudent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ClassAndStudentServiceImpl implements ClassAndStudentService {
    @Autowired
    private ClassandstudentDao classandstudentDao;
    //模糊查询根据姓名和电话
    @Override
    public List<Classandstudent> findAll(String Name, String Phone) {
        return classandstudentDao.findAll(Name,Phone);
    }
}
