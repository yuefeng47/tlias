package com.itheima.mapper;

import com.itheima.pojo.StatData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReportMapper {

    /**
     * 従業員の性別統計
     */
    @Select("select " +
            "case gender when 1 then '男性员工' when 2 then '女性员工' end as name, " +
            "count(*) as value " +
            "from emp " +
            "group by gender")
    List<StatData> empGenderData();

}
