package com.example.mybatis.Mapper;

import com.example.mybatis.Bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })

    @Select("select * from user where u_id=#{u_id}")
    public User findUserById(String u_id);

    @Select("select * from user")
    public List<User> findAllusers();

    @Delete("delete from user where u_id = #{u_id}")
    public int deleteUserById(String u_id);

    @Insert("insert into user(name,age,birthday,salary) values(#{name},#{age},#{birthday}")
    public int addUser(User user);

    @Update("update user set name = #{name},age=#{age},birthday=#{birthday},salary=#{salary}")
    public int updateUser(User user);

    @Select("SELECT * FROM user WHERE age = #{age}") //3
    List<User> get(String age);

    @Insert("INSERT INTO user(name,age) VALUES (#{name},#{age})") //3
    void insert(User user);


}
