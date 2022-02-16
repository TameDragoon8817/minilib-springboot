package com.mavenbase.minilibspringboot.pojo;

public class Books {
    private String bookId;
    private String isbn;
    private String title;
    private String authors;
    private String pressId;
    private String typeId;

    @Override
    public String toString() {
        return "Books{" +
                "bookId='" + bookId + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", pressId='" + pressId + '\'' +
                ", typeId='" + typeId + '\'' +
                '}';
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public String getPressId() {
        return pressId;
    }

    public void setPressId(String pressId) {
        this.pressId = pressId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
