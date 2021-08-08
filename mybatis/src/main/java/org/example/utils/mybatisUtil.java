package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtil {

    public static SqlSessionFactory factory = null;

    static {
        //1.定义mybatis主配置文件的名称，从类路径的根开始(target/classes)
        String 配置文件名 = "mybatis.xml";
        //2.读取这个config表示的文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(配置文件名);
            //3.创建 SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //4.通过 SqlSessionFactoryBuilder对象 创建 SqlSessionFactory对象
            factory = builder.build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {

        SqlSession sqlSession = null;
        if (factory != null) {
            //5.【重要】从 SqlSessionFactory对象 中获取sqlSession对象
            //---参数true为自动提交事务
            //--------------    openSession(true)
            sqlSession = factory.openSession();
        }

        return sqlSession;
    }

}



