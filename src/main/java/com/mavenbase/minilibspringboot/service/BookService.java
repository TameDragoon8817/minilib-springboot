package com.mavenbase.minilibspringboot.service;

import com.mavenbase.minilibspringboot.pojo.Books;

import java.util.List;

public interface BookService{
    List<Books> queryBookListByTitle(String title);
    int insertBook(Books books);
    int deleteBook(Books books);
    int updateBook(Books books);
}
