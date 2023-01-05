package com.powernode.spring6.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 陈森
 * @Date 2023/1/2 18:26
 * @PackageName:com.powernode.spring6.bean
 * @ClassName: User
 * @Description: 简单类型注入
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
