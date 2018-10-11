package com.dean.ssmdemo2.mapper;

import com.dean.ssmdemo2.entity.Emp;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    public Emp findById(Integer empno);

    public List<Map> findEmps(Map param);

    public void insertEmp(Emp ep);

    public void updateEmp(Emp ep);

    public void  deleteEmp(Integer eno);
}
