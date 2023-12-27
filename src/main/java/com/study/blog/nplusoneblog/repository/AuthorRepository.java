package com.study.blog.nplusoneblog.repository;

import com.study.blog.nplusoneblog.entity.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository  extends JpaRepository<Author, Long> {
    // join fetch 사용하기
    @Query("SELECT distinct a FROM Author a JOIN FETCH a.books")
    List<Author> findAllWithBooks();

    // EntityGraph 사용하기
//    @EntityGraph(value = "Author.books", type = EntityGraph.EntityGraphType.LOAD)
//    List<Author> findAll();

}
