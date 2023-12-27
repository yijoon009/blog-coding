package com.study.blog.nplusoneblog.controller;

import com.study.blog.nplusoneblog.entity.Author;
import com.study.blog.nplusoneblog.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@RequestMapping("/authors")
@RestController
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/all-authors")
    public ResponseEntity<List<String>> getAllAuthors() {
        List<Author> allAuthors = authorService.findAllAuthors();
        return ResponseEntity.ok(allAuthors.stream().map(Author::getName).collect(Collectors.toList()));
    }
    
    @GetMapping("/with-books")
    public ResponseEntity<List<String>> getAllAuthorsWithBooks() {
        List<Author> allAuthorsWithBooks = authorService.findAllAuthorsWithBooks();
        return ResponseEntity.ok(allAuthorsWithBooks.stream().map(Author::getName).collect(Collectors.toList()));
    }

}