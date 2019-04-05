package com.lemo.mapper;

import com.lemo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: laojie
 * @Date: $(DATE) $(TIME)
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {
    User loadUserByUserNameAndPwd();
}
