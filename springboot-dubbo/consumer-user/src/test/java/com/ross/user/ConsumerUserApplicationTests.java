package com.ross.user;

import com.ross.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerUserApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        userService.hello();
    }

}
