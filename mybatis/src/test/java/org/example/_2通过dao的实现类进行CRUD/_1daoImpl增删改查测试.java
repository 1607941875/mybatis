package org.example._2通过dao的实现类进行CRUD;

import org.example.dao.StudentDao;
import org.example.dao.impl.StudentDaoImpl;
import org.example.entity.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _1daoImpl增删改查测试 {

    @Test
    public void 查询测试() {

        StudentDao studentDao = new StudentDaoImpl();
        List<Student> studentList = studentDao.selectAll();
        studentList.forEach(stu -> System.out.println(stu));

    }
    @Test
    public void 插入测试(){

        StudentDao studentDao = new StudentDaoImpl();
        int insertResult = studentDao.insertStudent(new Student(113,"fff","fff@qq.com",10));
        System.out.println(insertResult);

    }

}
