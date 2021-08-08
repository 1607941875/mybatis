package org.example._5井和$的区别;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.utils.mybatisUtil;
import org.junit.Test;

public class _2通过$接收参数排序 {
    @Test
    public void 过$接收参数排序() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.通过$接收参数排序("name", "22", "@qq.com");
    }

}
