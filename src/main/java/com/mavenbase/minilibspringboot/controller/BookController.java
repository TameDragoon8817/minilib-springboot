package com.mavenbase.minilibspringboot.controller;

import com.mavenbase.minilibspringboot.pojo.BookType;
import com.mavenbase.minilibspringboot.pojo.Books;
import com.mavenbase.minilibspringboot.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {
    @Resource
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/book/query/")
    public String QueryBook(String title, Model model){
        List<Books> listByTitle = bookService.queryBookListByTitle(title);
        model.addAttribute("list",listByTitle);
        System.out.println(listByTitle);
        return "book/query-list";
    }

    @RequestMapping("book/toUpdate/{id}")
    public String ToUpdateBook(@PathVariable("id")int id,Model model){
        List<BookType> bookTypes=bookService.queryBookTypeList();
        model.addAttribute("bookTypes",bookTypes);
        Books item = bookService.queryBookListById(id);
        model.addAttribute("bookItem",item);
        return "book/update";
    }


    @RequestMapping("/book/update")
    public String UpdateBook(Books books,Model model){
        System.out.println(books);
        bookService.updateBook(books);
        model.addAttribute("msg","更新操作成功");
        String emptyTitle="";
        List<Books> listByTitle = bookService.queryBookListByTitle(emptyTitle);
        model.addAttribute("list",listByTitle);
        System.out.println(listByTitle);
        return "book/query-list";
    }

    @RequestMapping("/book/delete/{id}")
    public String DeleteBook(@PathVariable("id")int id,Model model){
        bookService.deleteBook(id);
        model.addAttribute("msg","删除操作成功");
        return "book/query-list";
    }
}
