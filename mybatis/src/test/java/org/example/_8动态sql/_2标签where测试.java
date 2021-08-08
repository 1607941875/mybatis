package org.example._8动态sql;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.CityDao;
import org.example.entity.City;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _2标签where测试 {
    @Test
    public void 标签where测试(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        cityDao.动态sql_2标签where(new City(1,"南昌市",null));

    }
}
