package com.mavenbase.minilibspringboot.service;

import com.mavenbase.minilibspringboot.dao.BookMapper;
import com.mavenbase.minilibspringboot.pojo.Books;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Books> queryBookListByTitle(String title) {
        return bookMapper.queryBookListByTitle(title);
    }

    @Override
    public int insertBook(Books books) {
        bookMapper.insertBook(books);
        return 0;
    }

    @Override
    public int deleteBook(Books books) {
        bookMapper.deleteBook(books);
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        bookMapper.updateBook(books);
        return 0;
    }
}
