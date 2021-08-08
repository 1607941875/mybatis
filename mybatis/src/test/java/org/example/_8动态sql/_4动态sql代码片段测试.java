package org.example._8动态sql;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.CityDao;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _4动态sql代码片段测试 {

    @Test
    public void 动态sql代码片段测试(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        cityDao.动态sql_4sql代码片段();

    }
}
