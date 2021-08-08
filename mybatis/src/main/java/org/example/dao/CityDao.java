package org.example.dao;


import org.example.entity.City;

import java.util.List;

public interface CityDao {

    public List<City> 动态sql_1标签if(City city);
    public List<City> 动态sql_2标签where(City city);
    public List<City> 动态sql_3标签foreach_List(List paraList);
    public List<City> 动态sql_3标签foreach_List对象(List<City> cityList);
    public List<City> 动态sql_4sql代码片段();

}
