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
public class StudentDegreeData {
    private String name;
    private Integer value;
}
