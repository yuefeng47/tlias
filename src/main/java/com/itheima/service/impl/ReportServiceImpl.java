package com.itheima.service.impl;

import com.itheima.mapper.ReportMapper;
import com.itheima.pojo.StatData;
import com.itheima.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;

    /**
     * @return 従業員の性別統計
     */
    @Override
    public List<StatData> empGenderData() {
        return reportMapper.empGenderData();

    }
}
