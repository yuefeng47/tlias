package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @Autowired
    private LogService logService;

    //ログ一覧ページング検索
    @GetMapping("/log/page")
    public Result logPage(Integer page, Integer pageSize) {
        PageBean pageBean = logService.logPage(page, pageSize);
        return Result.success(pageBean);
    }
}
