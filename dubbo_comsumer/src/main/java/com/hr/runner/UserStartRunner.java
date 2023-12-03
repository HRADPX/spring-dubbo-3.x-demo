package com.hr.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hr.service.UserBizService;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-12-03
 */
@Component
public class UserStartRunner implements CommandLineRunner {

    @Autowired
    private UserBizService userBizService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=======" + userBizService.getUser("111"));
    }
}
