package com.itheima.service;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;

import java.util.List;

public interface ClazzsService {
    //分页查询
    PageBean queryClazz(Integer page, Integer pageSize);

    //根据id进行删除
    void deleteClazzById(Integer id);

    //添加
    void insertClazz(Clazz clazz);

    //根据id进行查询
    Clazz selectClazzById(Integer id);

    //修改
    void updateClazz(Clazz clazz);

    //查询全部
    List<Clazz> selectAllClazz(Clazz clazz);
}
