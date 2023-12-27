package com.study.blog.nplusoneblog.service;

import com.study.blog.nplusoneblog.entity.Author;
import com.study.blog.nplusoneblog.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class AuthorService {
    private final AuthorRepository authorRepository;


    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Author> findAllAuthorsWithBooksJoinFetch() {
        List<Author> authors = authorRepository.findAllWithBooks();
        return authors;
    }

    public List<Author> findAllAuthorsWithBooksEntityGraph() {
        List<Author> authors = authorRepository.findAll();
        return authors;
    }

    public List<Author> findAllAuthorsWithBooksBatchSize() {
        List<Author> authors = authorRepository.findAll();
        authors.forEach(author -> author.getBooks().size()); // 각 저자의 책 목록을 로드하도록 강제
        return authors;
    }
}