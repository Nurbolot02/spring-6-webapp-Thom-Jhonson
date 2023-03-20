package com.ntg.spring6webapp.services.abstracts;

import com.ntg.spring6webapp.model.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
