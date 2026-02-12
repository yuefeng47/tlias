package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    // 起别名解决映射问题
    // @Select("select id, name, create_time as createTime , update_time as updateTime from dept")
    @Select("select id, name, create_time, update_time from dept")
    // 通过注解Results 和 Result 解决映射问题
//    @Results(value = {
//            @Result(column = "create_time" , property = "createTime" ) ,
//            @Result(column = "update_time" , property = "updateTime")
//    })
    List<Dept> queryDepartments();

    @Delete("delete from dept where id = #{id}")
    void deleteDeptById(Integer id);


    @Insert("insert into dept (name , create_time , update_time) values (#{name} , #{createTime} , #{updateTime})")
    void insertDept(Dept dept);

    @Select("select * from dept where id = #{id} ")
    Dept getDeptById(Integer id);

    @Update("update dept set name = #{name} , update_time = #{updateTime} where id = #{id}")
    void updateDept(Dept dept);
}