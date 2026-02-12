package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//控制类
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    //分页查询
    @GetMapping
    public Result queryString(Integer page, Integer pageSize) {
        PageBean pageBean = empService.queryString(page, pageSize);
        return Result.success(pageBean);
    }

    //根据id删除员工
    @DeleteMapping
    public Result deleteEmp(@RequestParam List<Integer> ids) {
        empService.deleteEmp(ids);
        return Result.success();
    }

    //添加员工
    @PostMapping
    public Result insertEmp(@RequestBody Emp emp) {
        empService.insertEmp(emp);
        return Result.success();
    }

    //根据id进行查询员工信息
    //有返回值
    @GetMapping("{id}")
    public Result selectEmpById(@PathVariable Integer id) {
        Emp emp = empService.selectEmpById(id);
        return Result.success(emp);
    }

    //修改员工
    @PutMapping
    public Result updateEmp(@RequestBody Emp emp) {
        empService.updateEmp(emp);
        return Result.success();
    }

    //查询全部员工
    @GetMapping("/list")
    public Result selectAllEmp(){
        List<Emp> list = empService.selectAllEmp();
        return Result.success(list);
    }

}
