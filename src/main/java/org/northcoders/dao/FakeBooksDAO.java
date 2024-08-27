package org.northcoders.dao;

import org.northcoders.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class FakeBooksDAO <E> {

    private final WebClient webClient;

    public FakeBooksDAO(String url) {
        this.webClient = WebClient.builder()
                .baseUrl(url)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public List<E> getData(String parameter) {
        ApiResponse response = webClient.get()
                .uri(parameter)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();

        return response != null ? response.getData() : null;
    }

}
