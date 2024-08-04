package com.yupi.yuojbackendquestionservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class YuojBackendQuestionServiceApplicationTests {

    @Test
    void contextLoads() { Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a+b;
        System.out.println(c);
    }

}
