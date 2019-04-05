package com.lemo.controller;

import com.lemo.bean.User;
import com.lemo.service.UserService;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: laojie
 * @Date: $(DATE) $(TIME)
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    private static final Logger LOGGER=Logger.getLogger(UserController.class);

    @RequestMapping(value = "/loadUser")
    public void loadUser(){
       User user= userService.loadUserByUserNameAndPwd();
       LOGGER.info("查询成功！");
    }
    @RequestMapping("/test")
    public void test(){
        LOGGER.info("测试日志");
    }

}
