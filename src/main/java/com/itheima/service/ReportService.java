package com.itheima.service;

import com.itheima.pojo.StatData;

import java.util.List;

public interface ReportService {
    // 従業員の性別統計
    List<StatData> empGenderData();

}
