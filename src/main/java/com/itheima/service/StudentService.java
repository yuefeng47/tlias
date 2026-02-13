package com.itheima.service;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Student;

import java.util.List;

public interface StudentService {
    //ページング検索 GET
    PageBean selectStudent(Integer page, Integer pageSize);

    //ID一覧に基づいて学生を削除する
    void deleteStudentByIds(List<Integer> ids);

    //POST学生新規登録
    void insertStudent(Student student);
}
