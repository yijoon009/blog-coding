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

    @GetMapping("/with-books/join-fetch")
    public ResponseEntity<List<String>> getAllAuthorsWithBooksJoinFetch() {
        List<Author> allAuthorsWithBooks = authorService.findAllAuthorsWithBooksJoinFetch();
        return ResponseEntity.ok(allAuthorsWithBooks.stream().map(Author::getName).collect(Collectors.toList()));
    }

    @GetMapping("/with-books/entity-graph")
    public ResponseEntity<List<String>> getAllAuthorsWithBooksEntityGraph() {
        List<Author> allAuthorsWithBooks = authorService.findAllAuthorsWithBooksEntityGraph();
        return ResponseEntity.ok(allAuthorsWithBooks.stream().map(Author::getName).collect(Collectors.toList()));
    }

    @GetMapping("/with-books/batch-size")
    public ResponseEntity<List<String>> getAllAuthorsWithBooksBatchSize() {
        List<Author> allAuthorsWithBooks = authorService.findAllAuthorsWithBooksBatchSize();
        return ResponseEntity.ok(allAuthorsWithBooks.stream().map(Author::getName).collect(Collectors.toList()));
    }

}