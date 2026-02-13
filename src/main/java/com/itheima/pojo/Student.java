package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 学生实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    
    private Integer id;              // 学生ID（主键，自增）
    private String name;             // 姓名
    private String no;               // 学号
    private Short gender;            // 性别（1:男, 2:女）
    private String phone;            // 手机号
    private String idCard;           // 身份证号
    private Short isCollege;         // 是否大专（1:是, 2:否）
    private String address;          // 联系地址
    private Short degree;            // 学历（1:初中, 2:高中, 3:大专, 4:本科, 5:硕士, 6:博士）
    private LocalDate graduationDate; // 毕业时间
    private Integer clazzId;         // 班级ID
    private Short violationCount;    // 违纪次数（默认0）
    private Short violationScore;    // 违纪扣分（默认0）
    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
}

