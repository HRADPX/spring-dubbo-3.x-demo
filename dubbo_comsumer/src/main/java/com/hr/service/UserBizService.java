package com.hr.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import com.hr.user.User;
import com.hr.user.UserService;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-12-03
 */
@Service
public class UserBizService {

    @DubboReference
    private UserService userService;

    public User getUser(String uid) {
         return userService.getUser(uid);
    }
}
