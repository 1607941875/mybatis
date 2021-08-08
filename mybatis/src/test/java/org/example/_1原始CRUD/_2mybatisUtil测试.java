package org.example._1原始CRUD;

import org.apache.ibatis.session.SqlSession;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _2mybatisUtil测试 {


    @Test
    public void 查询测试() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        //6.【重要】指定要执行的sql语句 标识
        String sqlId = "org.example.dao.StudentDao" + "." + "selectAll";
        //7.通过sqlSession对象，执行sql语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        studentList.forEach(stu -> System.out.println(stu));
        sqlSession.close();

    }

    @Test
    public void 插入测试() {
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        String sqlId = "org.example.dao.StudentDao" + "." + "insertStudent";
        int insertResult = sqlSession.insert(sqlId, new Student(112, "eee", "eee@qq.com", 22));
        sqlSession.commit();
        sqlSession.close();
        System.out.println("插入结果" + insertResult);
    }
}
