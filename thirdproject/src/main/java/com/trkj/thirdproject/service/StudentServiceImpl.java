package com.trkj.thirdproject.service;

import com.trkj.thirdproject.dao.SourceDao;
import com.trkj.thirdproject.dao.StudentDao;
import com.trkj.thirdproject.entity.Source;
import com.trkj.thirdproject.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private SourceDao sourceDao;
    @Override
    public List<Student> selectAllstudent() {
        log.debug("查询");
        return studentDao.selectAllstudent();
    }

    @Override
    public Student addstudent(Student student) {
        log.debug("新增");
        student.setStudentNumber("c00"+student.getSourceId()+1);
        studentDao.addstudent(student);
        return student;
    }
//删除
    @Override
    public int delstuTimeness(String delname, Date deltime, Integer studentId) {

        return studentDao.delstuTimeness(delname,deltime,studentId);
    }
//修改
    @Override
    public Student updatestudent(Student student) {
        student.setUpdatename("tsm管理");
        student.setUpdatetime(new Date());
        student.setStudytime(new Date());
        studentDao.updatestudent(student);
        return student;
    }
    //查询所有值（生源渠道）
    @Override
    public List<Source> selectalls() {
        return sourceDao.selectalls();
    }
}
