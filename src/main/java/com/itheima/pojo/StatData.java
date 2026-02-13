package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统计数据VO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatData {
    private String name;   // 名称
    private Integer value; // 数量
}

