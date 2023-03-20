package com.ntg.spring6webapp.controllers;

import com.ntg.spring6webapp.services.abstracts.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());

        return "books";
    }

}
