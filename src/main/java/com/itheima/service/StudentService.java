package com.itheima.service;

import com.itheima.pojo.PageBean;

public interface StudentService {
    //ページング検索 GET
    PageBean selectStudent(Integer page, Integer pageSize);
}
