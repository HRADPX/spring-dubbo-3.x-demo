package com.hr.service;

import org.apache.dubbo.config.annotation.DubboService;

import com.hr.user.User;
import com.hr.user.UserService;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-12-03
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String uid) {
        return new User(uid, "dubbo");
    }
}
