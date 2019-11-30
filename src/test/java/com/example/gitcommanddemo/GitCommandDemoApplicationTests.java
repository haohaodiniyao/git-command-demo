package com.example.gitcommanddemo;

import com.example.gitcommanddemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitCommandDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

}
