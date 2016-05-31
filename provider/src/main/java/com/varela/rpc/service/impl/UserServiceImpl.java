package com.varela.rpc.service.impl;


import com.varela.rpc.pojo.User;
import com.varela.rpc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lance on 2016-05-26.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    public User queryUserById(Integer id) {
        User user=new User();
        user.setId(id);
        user.setName("测试");
        user.setStatus(Byte.valueOf("1"));
        user.setType(Byte.valueOf("1"));

        return user;
    }
}
