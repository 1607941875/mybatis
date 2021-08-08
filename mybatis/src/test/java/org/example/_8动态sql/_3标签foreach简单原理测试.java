package org.example._8动态sql;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _3标签foreach简单原理测试 {
    @Test
    public void 标签foreach简单原理测试() {

        String sql = "select * from where id in ";
        StringBuilder builder = new StringBuilder();
        List<Integer> paramList = new ArrayList<Integer>();
        paramList.add(110);
        paramList.add(111);
        paramList.add(112);

        builder.append("(");
        for (Integer i : paramList) {
            builder.append(i).append(",");
        }

        builder.deleteCharAt(builder.length() - 1);
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println(sql);
    }


}
