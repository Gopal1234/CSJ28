package com.cyber.Csj28SpringBootDemo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyber.Csj28SpringBootDemo2.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
