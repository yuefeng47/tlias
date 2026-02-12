package com.itheima.service.impl;

import com.itheima.log.LoggerUtil;
import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import com.itheima.service.DeptService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service// 把此类的对象交给了 ioc 管理
public class DeptServiceImpl implements DeptService {
    // 获取持久层对象
    @Autowired
    private DeptMapper deptMapper;

    /**
     * @return
     * 查询所有
     */
    @Override
    public List<Dept> queryDepartments() {
        List<Dept> depts = deptMapper.queryDepartments();
        return depts;
    }

    /**
     * @param id
     * 进行删除没有返回值
     */
    @Override
    public void deleteDeptById(Integer id) {
        deptMapper.deleteDeptById(id);
    }

    /**
     * @param dept
     * 添加
     */
    @Override
    public void insertDept(Dept dept) {
        deptMapper.insertDept(dept);
    }

    /**
     * @param id
     * 根据id查询并进行修改
     * @return
     */
    @Override
    public Dept getDeptById(Integer id) {
        Dept deptById = deptMapper.getDeptById(id);
        return deptById;
    }

    /**
     * @param dept
     */
    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }

    /* *//**
     * 查询所有部门
     *
     * @return 部门集合
     *//*
    @Override
    public List<Dept> queryDepartments() {
        List<Dept> depts = deptMapper.queryDepartments();
        // 返回给控制层
        return depts;
    }

    *//**
     * 根据 id 删除部门
     *
     * @param id
     *//*
    @Override
    public void deleteDeptById(Integer id) {
        deptMapper.deleteDeptById(id);
    }

    *//**
     * 新增部门
     *
     * @param dept 部门对象
     *//*
    @Override
    public void insertDept(Dept dept) {
        // 补全属性 , 因为dept中只有部门名, 没有创建时间和最后修改时间
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insertDept(dept);
    }

    *//**
     * 根据 id 查询部门
     *
     * @param id 编号
     * @return 部门对象
     *//*
    @Override
    public Dept getDeptById(Integer id) {
        Dept dept = deptMapper.getDeptById(id);
        return dept;
    }

    *//**
     * 修改部门
     *
     * @param dept 部门对象
     *//*
    @Override
    public void updateDept(Dept dept) {
        // 补全属性, 最后修改时间
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.updateDept(dept);
    }*/
}
