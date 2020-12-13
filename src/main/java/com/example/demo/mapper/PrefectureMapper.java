package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PrefectureMapper {

    @Select("    SELECT code\n" +
            "      ,name\n" +
            "    FROM\n" +
            "      prefectures\n" +
            "    ORDER BY\n" +
            "    code")
    List<Map<String, Object>> selectAll();
}
