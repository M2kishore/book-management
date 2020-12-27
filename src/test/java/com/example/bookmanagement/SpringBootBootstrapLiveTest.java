package com.example.bookmanagement;

import javax.ws.rs.core.Response;

import org.apache.tomcat.util.http.parser.MediaType;

public class SpringBootBootstrapLiveTest {

    private static final String API_ROOT
      = "http://localhost:8085/api/books";

    private Book createRandomBook() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }

    private String createBookAsUri(Book book) {
        Response response = RestAssured.given()
          .contentType(MediaType.APPLICATION_JSON_VALUE)
          .body(book)
          .post(API_ROOT);
        return API_ROOT + "/" + ((Object) response).jsonPath().get("id");
    }
}
