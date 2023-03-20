package com.ntg.spring6webapp.bootstrap;

import com.ntg.spring6webapp.model.Author;
import com.ntg.spring6webapp.model.Book;
import com.ntg.spring6webapp.model.Publisher;
import com.ntg.spring6webapp.repositories.AuthorRepository;
import com.ntg.spring6webapp.repositories.BookRepository;
import com.ntg.spring6webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    @Override
    public void run(String... args) throws Exception {
        Author author = Author.builder()
                .firstName("Author 1")
                .build();

        Book book = Book.builder()
                .title("book 1")
                .build();

        Publisher publisher = Publisher.builder()
                .publisherName("Publisher 1")
                .build();


        author.addBook(book);
        publisher.addBook(book);


        authorRepository.save(author);
        publisherRepository.save(publisher);
        bookRepository.save(book);


    }
}
