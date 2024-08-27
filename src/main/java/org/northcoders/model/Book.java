package org.northcoders.model;

import java.util.Date;

public record Book(int id,
                   String title,
                   String author,
                   String genre,
                   String description,
                   Long isbn,
                   String image,
                   Date published,
                   String publisher) {

    public Book(int id, String title, String author, String genre, String description, Long isbn, String image, Date published, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.isbn = isbn;
        this.image = image;
        this.published = published;
        this.publisher = publisher;
    }
}
