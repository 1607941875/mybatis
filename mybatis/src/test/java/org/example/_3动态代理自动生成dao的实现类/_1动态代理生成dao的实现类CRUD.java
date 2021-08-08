package org.example._3动态代理自动生成dao的实现类;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _1动态代理生成dao的实现类CRUD {
    @Test
    public void 查询测试() {

        /**
         * 使用mybatis的动态代理机制，使用SqlSession.getMapper(dao接口)
         * getMapper能获取dao接口对应的实现类对象。
         * */
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDaoImpl = sqlSession.getMapper(StudentDao.class);
        System.out.println("studentDaoImpl === "+studentDaoImpl.getClass().getName());
        studentDaoImpl.selectAll();
        sqlSession.close();

    }

    @Test
    public void 插入测试() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDaoImpl = sqlSession.getMapper(StudentDao.class);
        int insertResult = studentDaoImpl.insertStudent(new Student(114, "ggg", "ggg@qq.com", 20));
        sqlSession.commit();
        sqlSession.close();
        System.out.println("输出结果" + insertResult);

    }

}
