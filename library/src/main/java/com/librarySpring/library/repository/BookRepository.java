package com.librarySpring.library.repository;

import com.librarySpring.library.model.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAvailableQuantityGreaterThanOrderByTitle(Integer quantity);

    @Query("SELECT b FROM Book b WHERE b.category.name = :categoryName")
    List<Book> findByCategoryName(@Param("categoryName") String categoryName);

    @Query("SELECT b FROM Book b JOIN b.authors a WHERE a.name = :authorName ORDER BY b.publicationYear")
    List<Book> findByAuthorName(@Param("authorName") String authorName);
}
