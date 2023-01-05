package com.powernode.spring6.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 陈森
 * @Date 2023/1/5 10:33
 * @PackageName:com.powernode.spring6.bean
 * @ClassName: Dog
 * @Description: P命名空间注入还是set注入，只不过可以让spring配置变得更简单
 * @Version 1.0
 */
@Data
public class Dog {
    private String name;
    private int age;
    private Date birthday;
}
