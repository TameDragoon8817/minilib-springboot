package com.mavenbase.minilibspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mavenbase.minilibspringboot.dao.BookMapper;
import com.mavenbase.minilibspringboot.pojo.BookType;
import com.mavenbase.minilibspringboot.pojo.Books;
import com.mavenbase.minilibspringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    BookMapper bookMapper;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /*@RequestMapping("/book/query/")
    public String QueryBook(String title, Model model){
        List<Books> listByTitle = bookService.queryBookListByTitle(title);
        model.addAttribute("list",listByTitle);
        return "book/query-list";
    }*/

    @RequestMapping("/book/query/")
    public String QueryBookPagination(int currentpage,String title,Model model){
        QueryWrapper<Books> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.like("title",title);
        Page<Books> objectPage = new Page<>(currentpage,20);
        bookMapper.selectPage(objectPage,objectQueryWrapper);
        List<Books> list = objectPage.getRecords();
        model.addAttribute("list",list);
        model.addAttribute("paginationTitle",title);
        model.addAttribute("totalRecord",objectPage.getTotal());
        model.addAttribute("totalPage",objectPage.getPages());
        model.addAttribute("currentPage",objectPage.getCurrent());
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
        bookService.updateBook(books);
        model.addAttribute("msg","更新操作成功");
        QueryBookPagination(1,"",model);
        return "book/query-list";
    }

    @RequestMapping("/book/toInsert")
    public String ToInsertBook(Books books,Model model){
        List<BookType> bookTypes=bookService.queryBookTypeList();
        model.addAttribute("bookTypes",bookTypes);
        return "book/insert";
    }

    @RequestMapping("/book/insert")
    public String InsertBook(Books books,Model model){
        System.out.println(books);
        bookService.insertBook(books);
        model.addAttribute("msg","添加操作成功");
        QueryBookPagination(1,"",model);
        return "book/query-list";
    }

    @RequestMapping("/book/delete/{id}")
    public String DeleteBook(@PathVariable("id")int id,Model model){
        bookService.deleteBook(id);
        model.addAttribute("msg","删除操作成功");
        QueryBookPagination(1,"",model);
        return "book/query-list";
    }
}
