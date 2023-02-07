package br.com.zazix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zazix.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
