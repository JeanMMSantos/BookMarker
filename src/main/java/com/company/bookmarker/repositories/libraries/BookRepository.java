package com.company.bookmarker.repositories.libraries;

import com.company.bookmarker.entities.libraries.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
