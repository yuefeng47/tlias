package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClazzsMapper {

    /**
     * 查询所有班级
     */
    @Select("select * from clazz")
    List<Clazz> queryClazz();

    /**
     * 根据id删除班级
     */
    @Delete("delete from clazz where id = #{id}")
    void deleteClazzById(Integer id);

    /**
     * 添加班级
     */
    void insertClazz(Clazz clazz);

    /**
     * 更新班级
     */
    void updateClazz(Clazz clazz);

    /**
     * 根据id查询班级
     */
    @Select("select * from clazz where id = #{id}")
    Clazz selectClazzById(Integer id);

    /**
     * 查询全部
     */
    @Select("Select * from clazz")
    List<Clazz> selectAllClazz(Clazz clazz);
}
