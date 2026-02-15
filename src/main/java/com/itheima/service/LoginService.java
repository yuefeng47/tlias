package com.itheima.service;

import com.itheima.pojo.Emp;

public interface LoginService {
    
    /**
     * 员工登录
     * @param emp
     * @return
     */
    Emp login(Emp emp);
}

