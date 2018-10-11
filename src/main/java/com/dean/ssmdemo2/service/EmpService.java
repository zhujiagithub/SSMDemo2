package com.dean.ssmdemo2.service;

import com.dean.ssmdemo2.entity.Emp;
import com.dean.ssmdemo2.mapper.EmpMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmpService {
    @Resource
    private EmpMapper em = null;

    public Emp findById(Integer eno){
        return em.findById(eno);
    }

    public List<Map> findEmps(String dname,Float sal){
        Map param = new HashMap();
        param.put("dn",dname);
        param.put("psal",sal);
        return em.findEmps(param);
    }

    public void insertEmp(Emp ep){
        em.insertEmp(ep);
    }

    public void updateEmp(Emp ep){
        em.updateEmp(ep);
    }

    public void deleteEmp(Integer eno){
        em.deleteEmp(eno);
    }
}
