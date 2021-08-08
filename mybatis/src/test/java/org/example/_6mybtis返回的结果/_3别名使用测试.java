package org.example._6mybtis返回的结果;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _3别名使用测试 {

    @Test
    public void 别名使用测试(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.别名的使用();

    }

}
