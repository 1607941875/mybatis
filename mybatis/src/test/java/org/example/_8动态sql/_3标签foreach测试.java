package org.example._8动态sql;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.CityDao;
import org.example.entity.City;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _3标签foreach测试 {


    @Test
    public void 动态sql_3标签foreach_List测试() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);

        //不能使用 List<Integer> 否则 dao.xml里<foreach>标签的collection="list"不能识别，因为那是list对象了
        List listId = new ArrayList();
        listId.add(1);
        listId.add(2);
        listId.add(3);
        cityDao.动态sql_3标签foreach_List(listId);

    }
    @Test
    public void 动态sql_3标签foreach_List测试对象(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        List<City> cityList = new ArrayList<City>();
        cityList.add(new City(1,null,null));
        cityList.add(new City(2,null,null));
        cityList.add(new City(3,null,null));
        cityDao.动态sql_3标签foreach_List对象(cityList);
    }
}
