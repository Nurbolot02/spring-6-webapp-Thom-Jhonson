package com.ntg.spring6webapp.services.impl;

import com.ntg.spring6webapp.model.Author;
import com.ntg.spring6webapp.repositories.AuthorRepository;
import com.ntg.spring6webapp.services.abstracts.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
