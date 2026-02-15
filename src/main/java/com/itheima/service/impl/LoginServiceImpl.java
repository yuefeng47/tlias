package com.itheima.service.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp login(Emp emp) {
        // 根据用户名和密码查询员工
        return empMapper.getByUsernameAndPassword(emp);
    }
}

