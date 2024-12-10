package models;

import dto.JsonBook;

public class Book {
    private String nameBook;
    private String author;
    private int pageNumber;
    private String categorie;


    public Book (JsonBook resposta1) {
        this.nameBook = title;
        this.author = authors;
        this.pageNumber = Integer.parseInt(pageCount);
        this.categorie = categories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", pageNumber=" + pageNumber +
                ", categorie='" + categorie + '\'' +
                '}';
    }

}
