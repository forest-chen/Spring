package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.User;
import com.powernode.spring6.service.CustomService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 陈森
 * @Date 2023/1/3 11:02
 * @PackageName:com.powernode.spring6.service.impl
 * @ClassName: CustomServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomServiceImpl implements CustomService {

    private User user;
    @Override
    public void save() {
        user.insert();
    }
}
