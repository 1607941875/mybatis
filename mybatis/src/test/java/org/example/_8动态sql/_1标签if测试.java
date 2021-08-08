package org.example._8动态sql;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.CityDao;
import org.example.entity.City;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _1标签if测试 {

    @Test
    public void 标签if测试(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        List<City> cityList = cityDao.动态sql_1标签if(new City(1,"南昌市",null));
        System.out.println(cityList);
    }
}
