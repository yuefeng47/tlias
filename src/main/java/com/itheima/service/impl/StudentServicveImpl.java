package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
        return new PageBean(students.getTotal(), students.getResult());
    }

    /**
     * @param ids ids削除
     */
    @Override
    public void deleteStudentByIds(List<Integer> ids) {
        studentMapper.deleteStudentByIds(ids);

    }

    /**
     * @param student POST学生新規登録
     */
    @Override
    public void insertStudent(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.insertStudent(student);
    }

    /**
     * @param id
     * @return IDに基づいて検索する
     */
    @Override
    public Student selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    /**
     * @param student 学生を更新する
     */
    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    /**
     * @param student
     * 規律違反をした学生
     */
    @Override
    public void updateStudentViolation(Student student) {
        studentMapper.updateStudentViolation(student);
    }
}
