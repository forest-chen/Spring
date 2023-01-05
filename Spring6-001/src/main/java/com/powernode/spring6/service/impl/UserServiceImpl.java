package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.User;
import com.powernode.spring6.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 陈森
 * @Date 2023/1/2 20:37
 * @PackageName:com.powernode.spring6.service
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private User user;
    @Override
    public void saveUser() {
        user.insert();
    }
}
