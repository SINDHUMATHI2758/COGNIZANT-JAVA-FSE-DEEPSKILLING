package org.example.service;



import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        bookRepository.displayBooks();
    }
}

