package com.example.mybatis.Controller;

import com.example.mybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    //用于浏览器 请求后台
    @RestController
    public class UserController {

        @Autowired //自动连接到 UserService Bean
        private UserService userService;

        @GetMapping("/show")   //还可以不要 /
        public String show(){
            return userService.show();
        }

        @GetMapping("/showDao")
        public Object showDao(String age){
            return userService.showDao(age);
        }

        @GetMapping("/insert")
        public String insert(String name,String age){
            return userService.insert(name,age);
        }
}
