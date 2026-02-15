package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    //id
    private Integer id;
    //操作人ID
    private Integer operateEmpId;
    //操作时间
    private String operateTime;
    //类名
    private String className;
    //方法名
    private String methodName;
    //方法请求参数
    private String methodParams;
    //返回值
    private String returnValue;
    //执行耗时, 单位ms
    private LocalDateTime costTime;
    //操作人姓名
    private String operateEmpName;
}
