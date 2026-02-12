package com.itheima.controller;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clazzs")
public class ClazzsController {
    //ioc注入
    @Autowired
    public ClazzsService clazzsService;

    //分页查询
    @GetMapping
    public Result queryClazz(Integer page, Integer pageSize) {
        PageBean pageBean = clazzsService.queryClazz(page, pageSize);
        return Result.success(pageBean);
    }

    //根据id进行删除
    @DeleteMapping("/{id}")
    public Result deleteClazzById(@PathVariable Integer id) {
        clazzsService.deleteClazzById(id);
        return Result.success();
    }

    //POST 添加不用返回
    @PostMapping
    public Result insertClazz(@RequestBody Clazz clazz) {
        clazzsService.insertClazz(clazz);
        return Result.success();
    }

    //根据id进行查询 GET
    @GetMapping("/{id}")
    public Result selectClazzById(@PathVariable Integer id) {
        Clazz clazz = clazzsService.selectClazzById(id);
        return Result.success(clazz);
    }

    //PUT 修改
    @PutMapping
    public Result updateClazz(@RequestBody Clazz clazz) {
        clazzsService.updateClazz(clazz);
        return Result.success();
    }

    //查询所有班级
    //查询所有要list 集合
    @GetMapping("/list")
    public Result selectAllClazz(Clazz clazz) {
        List<Clazz> clazzList = clazzsService.selectAllClazz(clazz);
        return Result.success(clazzList);
    }
}
