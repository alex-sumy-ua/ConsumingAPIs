package org.northcoders.dao;
import org.northcoders.model.Book;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;


import javax.xml.crypto.Data;
import java.util.ArrayList;

public class FakeBooksDAO {

    private final WebClient webClient;

    public FakeBooksDAO() {
        this.webClient = WebClient.builder()
                .baseUrl("https://fakerapi.it/api/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
    // url = https://fakerapi.it/api/v1/books


public ArrayList<Book> getBooks() {
    ResponseEntity<Data> response = webClient.get()
            .uri("v1/books")
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .toEntity(Data.class)
            .block();

    if(response != null && response.hasBody()) {
        return response.getBody().
    } else {
        throw new RuntimeException("The data was not found");
    }

    }

//    public Book getResponseFromAPI (String url) {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//               // .uri(URI.create("https://fakerapi.it/api/v1/books"))
//                .build();
//
//        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        // do we need a status code exception???? if we
//        if (response.statusCode = 200) {
//            return objectMapper.readValue(response)
//        }
    }
    
}
