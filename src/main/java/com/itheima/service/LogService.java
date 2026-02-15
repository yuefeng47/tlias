package com.itheima.service;

import com.itheima.pojo.PageBean;

public interface LogService {

    PageBean logPage(Integer page, Integer pageSize);
}
