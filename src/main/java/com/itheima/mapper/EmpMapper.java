package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 查询所有员工
     */
    @Select("select * from emp")
    List<Emp> list();

    /**
     * 根据ids进行删除
     *
     * @param ids
     */

    void deleteEmp(List<Integer> ids);


    void insertEmp(Emp emp);

    /**
     * 根据id查询员工
     */
    @Select("select * from emp where id = #{id}")
    Emp selectEmpById(Integer id);

    /**
     * 更改员工
     *
     * @param emp
     */
    void updateEmp(Emp emp);

    //查询全部
    @Select("select * from emp")
    List<Emp> selectAllEmp();

    /**
     * 根据用户名和密码查询员工
     */
    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getByUsernameAndPassword(Emp emp);

}
