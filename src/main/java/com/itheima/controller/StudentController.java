package com.itheima.controller;

import com.github.pagehelper.Page;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
