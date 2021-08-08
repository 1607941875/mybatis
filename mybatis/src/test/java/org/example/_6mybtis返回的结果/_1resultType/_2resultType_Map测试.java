package org.example._6mybtis返回的结果._1resultType;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.utils.mybatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class _2resultType_Map测试 {
    @Test
    public void  resultType_Map测试(){

        /**
         * 根据sql的别名生成 map的key ，跟我写的反射完美版差不多
         *
         * */

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Map<Object,Object>> map= studentDao.resultType_Map();


    }

}
