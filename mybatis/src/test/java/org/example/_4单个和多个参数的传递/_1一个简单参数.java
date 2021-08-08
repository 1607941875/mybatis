package org.example._4单个和多个参数的传递;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _1一个简单参数 {

    @Test
    public void 根据id搜索学生() {

        /**
         * 简单参数:java基本类型 和 String 可以用 #{任意字符} 其实就是 占位符 ?
         *
         * 相当于执行如下代码：
         * mybatis 创建Connection ,PreparedStatement对象
         * String sql = "select id,name,email,age from student where id=?"
         * PreparedStatement pst = conn.preparedStatement(sql);
         * pst.setInt(1,110)
         * */
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDaoImpl = sqlSession.getMapper(StudentDao.class);
        Student student = studentDaoImpl.selectById(110);
        System.out.println(student);
    }


}
