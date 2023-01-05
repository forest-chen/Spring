package com.powernode.spring6.test;

import com.powernode.spring6.bean.Dog;
import com.powernode.spring6.bean.User;
import com.powernode.spring6.service.impl.CustomServiceImpl;
import com.powernode.spring6.service.impl.UserServiceImpl;
import lombok.val;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 陈森
 * @Date 2023/1/2 18:53
 * @PackageName:com.powernode.spring6.test
 * @ClassName: FirstSpringTest
 * @Description: TODO
 * @Version 1.0
 */
public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
        //获取spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //根据bean id从spring容器中获取对象
        UserServiceImpl userBean = applicationContext.getBean("UserServiceImplBean", UserServiceImpl.class);
        userBean.saveUser();
        //System.out.println(userBean);
    }

    @Test
    public void testSecondSpringCode(){
        //获取spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //根据bean id从spring容器中获取对象
        CustomServiceImpl customServiceImplBean = applicationContext.getBean("CustomServiceImplBean", CustomServiceImpl.class);
        customServiceImplBean.save();
        //System.out.println(userBean);
    }

    @Test
    public void testThirdSpringCode(){
        //获取spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //根据bean id从spring容器中获取对象
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean.toString());
        //System.out.println(userBean);
    }

    @Test
    public void testPSpringCode(){
        //获取spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-p.xml");
        //根据bean id从spring容器中获取对象
        Dog dogBean = applicationContext.getBean("DogBean", Dog.class);
        System.out.println(dogBean.toString());
        //System.out.println(userBean);
    }
}
