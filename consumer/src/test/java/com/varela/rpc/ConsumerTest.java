package com.varela.rpc;

import com.alibaba.fastjson.JSON;
import com.varela.rpc.pojo.User;
import com.varela.rpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by lance on 2016-06-01.
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ConsumerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public void run() {
        User user = this.userService.queryUserById(1);
        System.out.println(JSON.toJSONString(user));
    }
}
