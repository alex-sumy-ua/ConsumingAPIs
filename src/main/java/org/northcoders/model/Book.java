package org.northcoders.model;

import java.util.Date;

public record Book(int id,
                   String title,
                   String author,
                   String genre,
                   String description,
                   String isbn,
                   String image,
                   Date published,
                   String publisher) {

}
