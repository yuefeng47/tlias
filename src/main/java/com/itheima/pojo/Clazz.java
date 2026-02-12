package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 班级实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    
    private Integer id;              // 班级ID（主键，自增）
    private String name;             // 班级名称
    private String room;             // 教室
    private LocalDate beginDate;     // 开班日期
    private LocalDate endDate;       // 结业日期
    private Integer masterId;        // 班主任ID
    private Short subject;           // 学科
    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
}

