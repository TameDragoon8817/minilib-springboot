package com.mavenbase.minilibspringboot.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_book")
public class Books {

    private String bookid;
    private String isbn;
    private String title;
    private String authors;
    private String pressid;
    private String typeid;

    @Override
    public String toString() {
        return "Books{" +
                "bookid='" + bookid + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", pressid='" + pressid + '\'' +
                ", typeid='" + typeid + '\'' +
                '}';
    }

    public Books() {
    }

    public Books(String bookid, String isbn, String title, String authors, String pressid, String typeid) {
        this.bookid = bookid;
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.pressid = pressid;
        this.typeid = typeid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPressid() {
        return pressid;
    }

    public void setPressid(String pressid) {
        this.pressid = pressid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }
}
