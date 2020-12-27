package com.example.bookmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
@Id
private Long id;
@Column
private String book_name;
@Column
private String author_name;

public Book(){ }

public Book(Long id, String book_name, String author_name, String isbn) {
this.id=id;
this.book_name=book_name;
this.author_name=author_name;
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getBook_name() {
return book_name;
}

public void setBook_name(String book_name) {
this.book_name = book_name;
}

public String getAuthor_name() {
return author_name;
}

public void setAuthor_name(String author_name) {
this.author_name = author_name;
}
}