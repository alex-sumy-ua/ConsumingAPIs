package org.northcoders;

import org.northcoders.model.Book;

import java.util.List;

public class ApiResponse <E> {
    private String status;
    private int code;
    private int total;
    private List<E> data;

    // Getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<Book> data) {
        this.data = (List<E>) data;
    }
}
