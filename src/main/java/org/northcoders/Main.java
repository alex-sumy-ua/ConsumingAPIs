package org.northcoders;

import org.northcoders.dao.FakeBooksDAO;
import org.northcoders.model.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FakeBooksDAO dao = new FakeBooksDAO();
        List<Book> books = dao.getBooks();
        books.forEach(System.out::println);
    }
}