package org.example._7like模糊查询;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _1Like模糊查询_java代码指定 {

    @Test
    public void Like模糊查询_java代码指定() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.Like模糊查询_1java代码指定("%qq.com");

    }


}
