package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Book;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String parameter = "/books";
        String url = "https://fakerapi.it/api/v1";

        FakeBooksDAO dao = new FakeBooksDAO(url);
        List<Book> books = dao.getData(parameter);

        String title = "";
        String author = "";
        for (Book book : books) {
            if (book.id() == 2) {
                author = book.author();
                title = book.title();
            }
        }

        books.forEach(System.out::println);

        System.out.println("The author of the book with title " + title + " is " + author);
    }

}
