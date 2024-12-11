package models;

import dto.JsonBook;
import dto.VolumeInfo;

import java.util.List;

public class Book {
    private String nameBook;
    private List author;
    private Integer pageNumber;
    private List categorie;

    public Book(JsonBook jsonResponse) {
        VolumeInfo volumeInfo = jsonResponse.items().getFirst().volumeInfo();
        this.nameBook = volumeInfo.title();
        this.author = volumeInfo.authors();
        this.pageNumber = volumeInfo.pageCount();
        this.categorie = volumeInfo.categories();
    }


    @Override
    public String toString() {
        return "Livro{" +
                "Autor='" + author + '\'' +
                ", Título='" + nameBook + '\'' +
                ", Paginas=" + pageNumber +
                ", Categoria='" + categorie + '\'' +
                '}';
    }

}
