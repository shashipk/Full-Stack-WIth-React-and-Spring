package com.example.BackendApp1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("select b from Book b where b.author=:author")
    public List<Book> getBooksByAuthorName(String author);

    @Query(value = "select * from book b where b.author=:author", nativeQuery = true)
    public List<Book> findByAuthor(String author);

    @Query("SELECT b FROM Book b WHERE b.author = :author and b.name = :name")
    Book findBookByAuthorsAndName(
            @Param("author") String author,
            @Param("name") String name);

}
