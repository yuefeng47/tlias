package com.itheima.service;

import com.itheima.pojo.StatData;
import com.itheima.vo.JobData;
import com.itheima.vo.StudentDegreeData;

import java.util.List;

public interface ReportService {
    // 従業員の性別統計
    List<StatData> empGenderData();

    //従業員の職位別人数集計
    JobData empJobData();

    //受講者の学歴別人数集計
    List<StudentDegreeData> studentDegreeData();

}
