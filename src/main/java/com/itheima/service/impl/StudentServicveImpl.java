package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicveImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * @param page     1
     * @param pageSize 10
     * @return
     */
    @Override
    public PageBean selectStudent(Integer page, Integer pageSize) {
        //1ページング処理を開始する
        PageHelper.startPage(page, pageSize);
        //2Mapper層にパラメータを渡す
        List<Student> pageList = studentMapper.selectStudent();
        //3形式を変換する
        Page<Student> students = (Page<Student>) pageList;
        //4戻り
        return new PageBean(students.getTotal(),students.getResult());
    }
}
