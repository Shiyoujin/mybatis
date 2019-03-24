package com.example.mybatis.Bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.annotation.XmlAnyElement;
import java.io.Serializable;

@Data
//用户实体类

public class User implements Serializable {
    private String u_id;
    private String name;
    private String age;
    private String birthday;
    private String salary;


}
