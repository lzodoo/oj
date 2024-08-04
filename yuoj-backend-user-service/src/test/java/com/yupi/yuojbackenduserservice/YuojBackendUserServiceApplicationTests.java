package com.yupi.yuojbackenduserservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class YuojBackendUserServiceApplicationTests {

    String password = "b0dd3697a192885d7c055db46155b26a";
    @Test
    void contextLoads() {
        String SALT = "yupi";
        String userPassword = "12345678";
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        System.out.println(encryptPassword);
    }

}
