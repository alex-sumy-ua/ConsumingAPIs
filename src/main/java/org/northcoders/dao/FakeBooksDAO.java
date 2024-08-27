package org.northcoders.dao;

import org.northcoders.ApiResponse;
import org.northcoders.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class FakeBooksDAO {

    private final WebClient webClient;

    public FakeBooksDAO() {
        this.webClient = WebClient.builder()
                .baseUrl("https://fakerapi.it/api/v1")
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public List<Book> getBooks() {
        ApiResponse response = webClient.get()
                .uri("/books")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();

        return response != null ? response.getData() : null;
    }
}
