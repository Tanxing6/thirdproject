package com.trkj.thirdproject.controller;

import com.trkj.thirdproject.entity.Classandstudent;
import com.trkj.thirdproject.service.ClassAndStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ClassAndStudentController {
    @Autowired
    private ClassAndStudentService classAndStudentService;
//    @GetMapping("/findAll")
//    public List<Classandstudent> findAll(@PathVariable("")){
//        return classAndStudentService.findAll()
//    }

}
