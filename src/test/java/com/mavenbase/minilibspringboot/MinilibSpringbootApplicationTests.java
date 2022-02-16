package com.mavenbase.minilibspringboot;

import com.mavenbase.minilibspringboot.dao.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinilibSpringbootApplicationTests {
    @Autowired
    BookMapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.queryBookListByTitle("计算机网络"));
    }

}
