package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ClazzsMapper;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;
import com.itheima.service.ClazzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzsServiceImpl implements ClazzsService {
    @Autowired
    private ClazzsMapper clazzsMapper;

    /**
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean queryClazz(Integer page, Integer pageSize) {
        //启动pageHelper
        PageHelper.startPage(page, pageSize);
        //mapper传递值
        List<Clazz> list = clazzsMapper.queryClazz();
        //Page变形
        Page<Clazz> pageList = (Page<Clazz>) list;
        //返回值
        return new PageBean(pageList.getTotal(), pageList.getResult());
    }

    /**
     * @param id 根据id删除
     */
    @Override
    public void deleteClazzById(Integer id) {
        clazzsMapper.deleteClazzById(id);

    }

    /**
     * @param clazz 添加班级
     */
    @Override
    public void insertClazz(Clazz clazz) {
        // 自动填充创建时间和更新时间
        clazz.setCreateTime(java.time.LocalDateTime.now());
        clazz.setUpdateTime(java.time.LocalDateTime.now());
        clazzsMapper.insertClazz(clazz);
    }

    /**
     * @param id 根据id进行查询
     * @return
     */
    @Override
    public Clazz selectClazzById(Integer id) {
        Clazz clazz = clazzsMapper.selectClazzById(id);
        return clazz;
    }

    /**
     * @param clazz 更新班级
     */
    @Override
    public void updateClazz(Clazz clazz) {
        // 自动更新修改时间
        clazz.setUpdateTime(java.time.LocalDateTime.now());
        clazzsMapper.updateClazz(clazz);
    }

    /**
     * @param clazz 查询全部
     * @return
     */
    @Override
    public List<Clazz> selectAllClazz(Clazz clazz) {
        List<Clazz> clazzList = clazzsMapper.selectAllClazz(clazz);
        return clazzList;
    }
}
