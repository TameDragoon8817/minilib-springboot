package com.mavenbase.minilibspringboot;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mavenbase.minilibspringboot.dao.BookMapper;
import com.mavenbase.minilibspringboot.pojo.Books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinilibSpringbootApplicationTests {
    @Autowired
    BookMapper bookMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void testPage(){
        Page<Books> objectPage = new Page<>(1,3);
        bookMapper.selectPage(objectPage,null);
        objectPage.getRecords().forEach(System.out::println);
        System.out.println(objectPage.getTotal());
        System.out.println(objectPage.getCurrent());
        System.out.println(objectPage.getPages());
    }
}
