package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.pojo.StatData;
import com.itheima.service.ReportService;
import com.itheima.vo.JobData;
import com.itheima.vo.StudentCountData;
import com.itheima.vo.StudentDegreeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    //従業員の性別統計
    @GetMapping("/empGenderData")
    public Result empGenderData() {
        List<StatData> empGenderList = reportService.empGenderData();
        return Result.success(empGenderList);
    }

    //従業員の職位別人数集計
    @GetMapping("/empJobData")
    public Result empJobData() {
        JobData jobData = reportService.empJobData();
        return Result.success(jobData);
    }

    //受講者の学歴別人数集計
    @GetMapping("/studentDegreeData")
    public Result studentDegreeData() {
        List<StudentDegreeData> studentDegreeData = reportService.studentDegreeData();
        return Result.success(studentDegreeData);
    }

    //クラス別人数集計
    @GetMapping("/studentCountData")
    public Result studentCountData() {
        StudentCountData studentCountData = reportService.studentCountData();
        return Result.success(studentCountData);
    }
}
