package in.axyya.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.axyya.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
