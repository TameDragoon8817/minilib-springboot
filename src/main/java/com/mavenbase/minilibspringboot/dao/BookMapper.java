package com.mavenbase.minilibspringboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mavenbase.minilibspringboot.pojo.BookType;
import com.mavenbase.minilibspringboot.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper extends BaseMapper<Books> {
    List<Books> queryBookListByTitle(String title);
    int insertBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    List<BookType> queryBookTypeList();
    Books queryBookListById(int id);
}
