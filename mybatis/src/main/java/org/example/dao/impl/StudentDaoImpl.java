package org.example.dao.impl;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.example.vo.查询参数对象;

import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAll() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        String sqlId = "org.example.dao.StudentDao" + "." + "selectAll";
        List<Student> studentList = sqlSession.selectList(sqlId);
        sqlSession.close();
        return studentList;

    }

    @Override
    public int insertStudent(Student student) {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        String sqlId = "org.example.dao.StudentDao" + "." + "insertStudent";
        int insertResult = sqlSession.insert(sqlId, student);
        sqlSession.commit();
        sqlSession.close();
        return insertResult;

    }


    @Override
    public Student selectById(int id) {
        return null;
    }

    @Override
    public List<Student> 多个参数查询_Param注解(int id, String name) {
        return null;
    }

    @Override
    public List<Student> 多个参数查询_参数对象(查询参数对象 paramObject) {
        return null;
    }

    @Override
    public List<Student> 多个参数查询_按位置(int id, String name) {
        return null;
    }

    @Override
    public List<Student> 多个参数查询_Map集合(Map paramMap) {
        return null;
    }

    @Override
    public List<Student> 通过$接收参数排序(@Param("columnName") String columnName, @Param("age") String age, @Param("lastEmail") String lastEmail) {
        return null;
    }

    @Override
    public List<Student> 别名的使用() {
        return null;
    }

    @Override
    public List<Map<Object, Object>> resultType_Map() {
        return null;
    }

    @Override
    public List<Student> resultMap() {
        return null;
    }

    @Override
    public List<Student> Like模糊查询_1java代码指定(String LastEmail) {
        return null;
    }

    @Override
    public List<Student> Like模糊查询_2mapper文件拼接(String LastEmail) {
        return null;
    }
}
