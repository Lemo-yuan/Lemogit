package com.lemo.service;

import com.lemo.bean.User;
import com.lemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

/**
 * @Author: laojie
 * @Date: $(DATE) $(TIME)
 * @Version: 1.0
 */
@Service
@Transactional
public class UserService {
    @Autowired@Resource
    UserMapper userMapper;
    public User loadUserByUserNameAndPwd(){
        return userMapper.loadUserByUserNameAndPwd();
    }
}
