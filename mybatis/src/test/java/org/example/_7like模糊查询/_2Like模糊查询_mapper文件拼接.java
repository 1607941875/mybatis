package org.example._7like模糊查询;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _2Like模糊查询_mapper文件拼接 {
    @Test
    public void Like模糊查询_mapper文件拼接(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.Like模糊查询_2mapper文件拼接("@qq.com");


    }
}
