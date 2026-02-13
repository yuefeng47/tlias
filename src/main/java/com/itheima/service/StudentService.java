package com.itheima.service;

import com.itheima.pojo.PageBean;

import java.util.List;

public interface StudentService {
    //ページング検索 GET
    PageBean selectStudent(Integer page, Integer pageSize);

    //ID一覧に基づいて学生を削除する
    void deleteStudentByIds(List<Integer> ids);
}
