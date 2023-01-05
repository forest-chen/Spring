package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author 陈森
 * @Date 2023/1/2 20:25
 * @PackageName:com.powernode.spring6.dao.impl
 * @ClassName: UserImpl
 * @Description: TODO
 * @Version 1.0
 */
public class UserImpl implements User {
    private static final Logger logger = LoggerFactory.getLogger(UserImpl.class);
    public void insert(){
        logger.info("数据库正在保存用户信息");
        logger.info("构造器注入");
    }
}
