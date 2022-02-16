package com.mavenbase.minilibspringboot.dao;

import com.mavenbase.minilibspringboot.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    List<Books> queryBookListByTitle(String title);
    int insertBook(Books books);
    int deleteBook(Books books);
    int updateBook(Books books);
}
