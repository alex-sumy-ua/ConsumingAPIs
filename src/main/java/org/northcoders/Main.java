package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Book;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String parameter1 = "/books";

        FakeBooksDAO dao = new FakeBooksDAO();
        List<Book> books = dao.getData(parameter1);

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
