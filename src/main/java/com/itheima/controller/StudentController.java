package com.itheima.controller;

import com.github.pagehelper.Page;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // 分页查询 GET
    @GetMapping
    public Result selectStudent(Integer page, Integer pageSize) {
        PageBean pageBean = studentService.selectStudent(page, pageSize);
        return Result.success(pageBean);
    }

    //ID一覧に基づいて学生を削除する
    @DeleteMapping("/{ids}")
    public Result deleteStudentByIds(@PathVariable List<Integer> ids) {
        studentService.deleteStudentByIds(ids);
        return Result.success();
    }

    //POST学生新規登録
    @PostMapping
    public Result insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
        return Result.success();
    }

    //GET IDに基づいて検索する
    @GetMapping("/{id}")
    public Result selectStudentById(@PathVariable Integer id) {
        Student student = studentService.selectStudentById(id);
        return Result.success(student);
    }

    //PUT 学生を更新する
    @PutMapping
    public Result updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return Result.success();
    }


}
