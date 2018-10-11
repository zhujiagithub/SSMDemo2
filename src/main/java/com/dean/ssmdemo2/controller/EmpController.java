package com.dean.ssmdemo2.controller;

import com.dean.ssmdemo2.entity.Emp;
import com.dean.ssmdemo2.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Resource
    private EmpService es = null;

    @GetMapping("/{id}")
    public Emp findById(@PathVariable("id") Integer eno){
        Emp ep = es.findById(eno);
        return ep;
    }

    @GetMapping("/list")
    public List<Map> findEmps(String dn,Float sal){
        List<Map> list = es.findEmps(dn,sal);
        return list;
    }
    @GetMapping("/insert")
    public Emp insertEmp(){
        Emp ep = new Emp();
        ep.setComm(1000f);
        ep.setDeptno(20);
        ep.setEname("张三");
        ep.setHiredate(new Date());
        ep.setJob("TEACHER");
        ep.setMgr(null);
        ep.setSal(10000f);
        es.insertEmp(ep);
        return ep;
    }

    @GetMapping("/update")
    public Emp updateEmp(){
        Emp ep = findById(7654);
        ep.setEname("李四");
        ep.setSal(20000f);
        ep.setDeptno(20);
        ep.setJob("TEACHER");
        es.updateEmp(ep);
        return ep;
    }

    @GetMapping("/delete/{id}")
    public Emp deleteEmp(@PathVariable("id") Integer eno){
        Emp ep = findById(eno);
        es.deleteEmp(eno);
        return ep;
    }
}
