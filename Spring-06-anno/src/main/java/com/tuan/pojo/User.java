package com.tuan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<!--    <bean id="user" class="com.tuan.pojo.User"/>-->
//@Component的意思是组件
@Component
@Scope("singleton")
public class User {
    public String name;

    @Value("TQsouls")
    public void setName(String name) {
        this.name = name;
    }
}
