package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.EmpService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    /**
     * @param page 1
     * @param pageSize 10
     * 分页查询
     * @return
     */
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean queryString(Integer page, Integer pageSize) {
        // 1,设置分页参数
        PageHelper.startPage(page, pageSize);
        // 2,执行查询
        List<Emp> list = empMapper.list();
        // 3,获取分页结果
        Page<Emp> pageList = (Page<Emp>) list;
        // 4,封装返回
        return new PageBean(pageList.getTotal(), pageList.getResult());
    }

    /**
     * @param ids 根据ids 进行删除
     *            没有返回值
     */
    @Override
    public void deleteEmp(List<Integer> ids) {
        empMapper.deleteEmp(ids);

    }

    /**
     * @param emp 添加员工
     */
    @Override
    public void insertEmp(Emp emp) {
        // 自动填充创建时间和更新时间
        emp.setCreateTime(java.time.LocalDateTime.now());
        emp.setUpdateTime(java.time.LocalDateTime.now());
        empMapper.insertEmp(emp);
    }

    /**
     * @param id 根据id进行查询
     * @return
     */
    @Override
    public Emp selectEmpById(Integer id) {
        Emp emp = empMapper.selectEmpById(id);
        return emp;
    }

    /**
     * @param emp 修改员工
     *            增删改没有返回值
     */
    @Override
    public void updateEmp(Emp emp) {
        // 自动更新修改时间
        emp.setUpdateTime(java.time.LocalDateTime.now());
        empMapper.updateEmp(emp);
    }

    /**
     * @return 查询全部
     */
    @Override
    public List<Emp> selectAllEmp() {
        return empMapper.selectAllEmp();

    }
}
