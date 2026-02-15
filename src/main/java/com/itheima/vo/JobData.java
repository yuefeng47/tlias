package com.itheima.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 员工职位统计数据VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobData {
    private List<String> jobList;    // 职位列表
    private List<Integer> dataList;  // 人数列表
}
