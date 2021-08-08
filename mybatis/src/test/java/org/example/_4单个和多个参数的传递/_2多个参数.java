package org.example._4单个和多个参数的传递;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.example.utils.mybatisUtil;
import org.example.vo.查询参数对象;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2多个参数 {

    @Test
    public void 使用Param注解() {
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.多个参数查询_Param注解(110, "aaa");

    }

    @Test
    public void 使用参数对象() {

        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        查询参数对象 paramObject = new 查询参数对象();
        paramObject.setParamId(110);
        paramObject.setParamName("fff");
        studentDao.多个参数查询_参数对象(paramObject);

    }

    @Test
    public void 按位置() {
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        studentDao.多个参数查询_按位置(110, "bbb");
    }

    @Test
    public void Map集合() {
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("paramId",110);
        paramMap.put("paramName","ddd");
        studentDao.多个参数查询_Map集合(paramMap);

    }

}
