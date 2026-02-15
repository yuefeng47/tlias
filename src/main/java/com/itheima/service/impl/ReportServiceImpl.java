package com.itheima.service.impl;

import com.itheima.mapper.ReportMapper;
import com.itheima.pojo.StatData;
import com.itheima.pojo.Student;
import com.itheima.service.ReportService;
import com.itheima.vo.JobData;
import com.itheima.vo.StudentDegreeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    /**
     * @return 従業員の職位別人数集計
     */
    @Override
    public JobData empJobData() {
        // 查询职位统计数据
        List<StatData> list = reportMapper.selectJobData();
        
        // 分离成两个列表
        List<String> jobList = new ArrayList<>();
        List<Integer> dataList = new ArrayList<>();
        
        for (StatData data : list) {
            jobList.add(data.getName());
            dataList.add(data.getValue());
        }
        
        // 封装成JobData对象
        return new JobData(jobList, dataList);
    }

    /**
     * @return 受講者の学歴別人数集計
     */
    @Override
    public List<StudentDegreeData> studentDegreeData() {
        List<StudentDegreeData> studentDegreeData = reportMapper.studentDegreeData();
        return studentDegreeData;
    }
}
