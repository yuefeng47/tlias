package com.itheima.mapper;

import com.itheima.pojo.StatData;
import com.itheima.vo.JobData;
import com.itheima.vo.StudentCountData;
import com.itheima.vo.StudentDegreeData;
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

    /**
     * 従業員の職位別人数集計
     */
    @Select("select " +
            "case job " +
            "  when 1 then '班主任' " +
            "  when 2 then '讲师' " +
            "  when 3 then '学工主管' " +
            "  when 4 then '教研主管' " +
            "  when 5 then '咨询师' " +
            "  else '其他' " +
            "end as name, " +
            "count(*) as value " +
            "from emp " +
            "group by job " +
            "order by job")
    List<StatData> selectJobData();

    /**
     * 受講者の学歴別人数集計
     */
    @Select("select " +
            "case degree " +
            "  when 1 then '初中' " +
            "  when 2 then '高中' " +
            "  when 3 then '大专' " +
            "  when 4 then '本科' " +
            "  when 5 then '硕士' " +
            "  when 6 then '博士' " +
            "end as name, " +
            "count(*) as value " +
            "from student " +
            "group by degree " +
            "order by degree")
    List<StudentDegreeData> studentDegreeData();

    /**
     * クラス別人数集計
     */
    @Select("select c.name, count(s.id) as value " +
            "from clazz c " +
            "left join student s on c.id = s.clazz_id " +
            "group by c.id, c.name " +
            "order by c.id")
    List<StatData> selectClazzData();

}
