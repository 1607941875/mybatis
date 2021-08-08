package org.example._1原始CRUD;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Student;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class _1增删查改测试 {


    //1.定义mybatis主配置文件的名称，从类路径的根开始(target/classes)
    String 配置文件名 = "mybatis.xml";
    //2.读取这个config表示的文件
    InputStream in = Resources.getResourceAsStream(配置文件名);
    //3.创建 SqlSessionFactoryBuilder对象
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    //4.通过 SqlSessionFactoryBuilder对象 创建 SqlSessionFactory对象
    SqlSessionFactory factory = builder.build(in);
    //5.【重要】从 SqlSessionFactory对象 中获取sqlSession对象
    //---参数true为自动提交事务
    //--------------    openSession(true)
    SqlSession sqlSession = factory.openSession();

    public _1增删查改测试() throws IOException {

    }


    @Test
    public void 查询测试()  {

        //6.【重要】指定要执行的sql语句 标识
        String sqlId = "org.example.dao.StudentDao" + "." + "selectAll";
        //7.通过sqlSession对象，执行sql语句
        List<Student> studentList = sqlSession.selectList(sqlId);

        studentList.forEach(stu -> System.out.println(stu));
        sqlSession.close();

    }


    @Test
    public void 插入测试() {

        //6.【重要】指定要执行的sql语句 标识
        String sqlId = "org.example.dao.StudentDao" + "." + "insertStudent";
        //6.5--------new 一个学生对象
        Student student = new Student(110, "ccc", "ccc@qq.com", 13);
        //7.通过sqlSession对象，执行sql语句
        int insertResult = sqlSession.insert(sqlId, student);
        //8.提交事务--mybatis默认不是自动提交事务的 所以数据库表没有数据 ,所以在 insert, update, delete 后 要手工提交事务
        sqlSession.commit();

        System.out.println("插入测试结果为" + insertResult);
        sqlSession.close();


    }
}
