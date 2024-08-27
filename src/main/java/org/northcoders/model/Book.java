package org.northcoders.model;

import java.util.Date;

public record Book(Long id,
                   String title,
                   String author,
                   String genre,
                   String description,
                   Long isbn,
                   String image,
                   Date published,
                   String publisher) {

}
