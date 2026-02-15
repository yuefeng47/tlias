package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.LogMapper;
import com.itheima.pojo.Log;
import com.itheima.pojo.PageBean;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//ログ一覧ページング検索
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    /**
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean logPage(Integer page, Integer pageSize) {

        //启动
        PageHelper.startPage(page, pageSize);
        //mapper传递
        List<Log> logList = logMapper.logPage();
        //变形
        Page<Log> logPageList = (Page<Log>) logList;
        //new 对象
        return new PageBean(logPageList.getTotal(), logPageList.getResult());
    }
}
