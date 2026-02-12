package com.itheima.controller;

import com.itheima.log.LoggerUtil;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 控制类
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    //查询 GetMapping 查询所有
    @GetMapping
    private Result queryDepartments() {
        List<Dept> depts = deptService.queryDepartments();
        return Result.success(depts);
    }

    //删除 根据id进行删除
    @DeleteMapping
    private Result deleteDeptById(Integer id) {
        deptService.deleteDeptById(id);
        return Result.success();
    }

    //添加部门 PostMapping
    @PostMapping
    private Result insertDept(@RequestBody Dept dept) {
        deptService.insertDept(dept);
        return Result.success();
    }

    //修改，先根据id查询，然后再修改
    @GetMapping("/{id}")
    private Result getDeptById(@PathVariable Integer id) {
        Dept deptById = deptService.getDeptById(id);
        return Result.success(deptById);
    }

    //修改
    @PutMapping
    private Result updateDept(@RequestBody Dept dept){
        deptService.updateDept(dept);
        return Result.success();
    }

}
