package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 通过名字查询用户信息
     * */
//    @Select("SELECT * FROM user WHERE name=#{name}")
    User findUserByName(@Param("name")String name);

    @Select("SELECT * FROM user")
    List<User> findAllUser();

    @Insert("INSERT INTO user(name,age,money) VALUES (#{name},#{age},#{money})")
    void insertUser(@Param("name")String name,@Param("age")Integer age,@Param("money")Double money);

    @Update("UPDATE user SET name=#{name},age=#{age},money=#{money}")
    void updateUser(@Param("name")String name,@Param("age")Integer age,@Param("money")Double money,@Param("id")int id);

    @Delete("DELETE FROM user WHERE id=#{id}")
    void deleteUser(@Param("id")int id);


}
