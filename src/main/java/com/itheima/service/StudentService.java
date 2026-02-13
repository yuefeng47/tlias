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

    //GET IDに基づいて検索する
    Student selectStudentById(Integer id);

    //学生を更新する
    void updateStudent(Student student);

    //規律違反をした学生
    void updateStudentViolation(Student student);
}
