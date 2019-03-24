package com.example.mybatis.Service;


import com.example.mybatis.Bean.User;
import com.example.mybatis.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String show(){
        return "Hello World!";
    }

    public List<User> showDao(String age){
        return userMapper.get(age);
    }


    public String insert(String name,String age){//插入一条记录
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userMapper.insert(user);
        return "Insert("+name +",age"+age+")OK!";
    }

}
