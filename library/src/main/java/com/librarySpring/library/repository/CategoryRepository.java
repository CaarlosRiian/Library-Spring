package com.librarySpring.library.repository;

import com.librarySpring.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("SELECT c.name AS categoryName, COUNT(b) AS bookCount " +
            "FROM Category c LEFT JOIN c.books b " +
            "GROUP BY c.name ORDER BY COUNT(b) DESC")
    List<Object[]> countBooksByCategory();
}
