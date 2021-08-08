package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Student;
import org.example.vo.查询参数对象;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    public Student selectById(int id);

    //查询student表中的所有数据
    public List<Student> selectAll();

    //插入方法
    public int insertStudent(Student student);

    //查询id为多少 或者 名字为多少的 学生
    //-------通过反射 获取注解值，然后注入给 sql
    public List<Student> 多个参数查询_Param注解(@Param("paramId") int id, @Param("paramName") String name);

    public List<Student> 多个参数查询_参数对象(查询参数对象 paramObject);

    /**
     * mybatis3.4之前，使用#{0} , #{1}
     * mybatis3.4之后, 使用#{arg0} , #{arg1}
     */
    public List<Student> 多个参数查询_按位置(int id, String name);

    public List<Student> 多个参数查询_Map集合(Map<String, Object> paramMap);

    public List<Student> 通过$接收参数排序(@Param("columnName") String columnName, @Param("age") String age, @Param("lastEmail") String lastEmail);

    public List<Student> 别名的使用();

    public List<Map<Object, Object>> resultType_Map();

    public List<Student> resultMap();

    public List<Student> Like模糊查询_1java代码指定(String LastEmail);

    public List<Student> Like模糊查询_2mapper文件拼接(String LastEmail);


}
