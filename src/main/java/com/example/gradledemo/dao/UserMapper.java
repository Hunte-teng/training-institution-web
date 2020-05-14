package com.example.gradledemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT username FROM user WHERE id = #{id}")
    /*@Results({
            @Result(property = "id",  column = "id", javaType = Integer.class),
            @Result(property = "username", column = "username",javaType = String.class)

    })*/
    public String  getUsernameById(Integer id);
}
