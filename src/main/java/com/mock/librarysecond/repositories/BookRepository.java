package com.mock.librarysecond.repositories;
import com.mock.librarysecond.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findOneByIsbn(String isbn);
}
