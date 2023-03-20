package com.ntg.spring6webapp.services.abstracts;

import com.ntg.spring6webapp.model.Book;

public interface BookService {
    Iterable<Book> findAll();
}
