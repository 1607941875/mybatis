package org.example._6mybtis返回的结果._2resultMap;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _1resultMap测试 {
    @Test
    public void _1resultMap测试(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.resultMap();
        for(Student student : studentList)
            System.out.println(student);
    }

}
