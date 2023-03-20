package com.ntg.spring6webapp.services.impl;

import com.ntg.spring6webapp.model.Book;
import com.ntg.spring6webapp.repositories.BookRepository;
import com.ntg.spring6webapp.services.abstracts.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
