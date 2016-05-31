package com.varela.rpc.service;

import com.varela.rpc.pojo.User;

/**
 * Created by lance on 2016-05-26.
 */
public interface UserService {

    User queryUserById(Integer id);
}
