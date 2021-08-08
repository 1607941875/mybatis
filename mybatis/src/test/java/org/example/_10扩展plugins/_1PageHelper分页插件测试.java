package org.example._10扩展plugins;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.example.dao.CityDao;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

public class _1PageHelper分页插件测试 {

    @Test
    public void PageHelper分页插件(){

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);

        //pageNum:第几页
        //pageSize:一页多少行数据
        PageHelper.startPage(2,3);

        cityDao.动态sql_4sql代码片段();

    }
}
