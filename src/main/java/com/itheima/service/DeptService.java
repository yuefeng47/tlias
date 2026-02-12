package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

public interface DeptService {
    //查询所有
    List<Dept> queryDepartments();

    // 删除
    void deleteDeptById(Integer id);

    //添加部门
    void insertDept(Dept dept);

    //查询id并修改
    Dept getDeptById(Integer id);

    //修改
    void updateDept(Dept dept);



    /* *//**
     * 查询所有部门
     * @return 部门集合
     *//*
   public abstract List<Dept> queryDepartments();

    *//**
     * 根据 id 删除部门
     * @param id
     *//*
    void deleteDeptById(Integer id);

    *//**
     * 新增部门
     * @param dept 部门对象
     *//*
    void insertDept(Dept dept);

    *//**
     * 根据 id 查询部门
     * @param id 编号
     * @return 部门对象
     *//*
    Dept getDeptById(Integer id);

    *//**
     * 修改部门
     * @param dept 部门对象
     *//*
    void updateDept(Dept dept);*/
}
