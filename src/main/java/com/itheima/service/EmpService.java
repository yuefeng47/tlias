package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;

import java.util.List;

public interface EmpService {

    // 分页查询
    PageBean queryString(Integer page, Integer pageSize);

    // ids删除
    void deleteEmp(List<Integer> ids);

    //添加员工
    void insertEmp(Emp emp);

    //根据id查询员工
    Emp selectEmpById(Integer id);

    //修改员工
    void updateEmp(Emp emp);

    //查询全部员工
    List<Emp> selectAllEmp();


}
