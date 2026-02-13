package com.itheima.mapper;

import com.itheima.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    
    /**
     * 全学生を検索する
     */
    @Select("select * from student")
    List<Student> selectStudent();

    /**
     * 学生を一括削除する
     */
    void deleteStudentByIds(List<Integer> ids);

    /**
     * 学生の新規登録
     */
    void insertStudent(Student student);

    /**
     * IDで学生を検索する
     */
    @Select("select * from student where id = #{id}")
    Student selectStudentById(Integer id);

    
    void updateStudent(Student student);


    void updateStudentViolation(Student student);
}
