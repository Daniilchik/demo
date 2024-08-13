package com.example.demo.service_module;

import com.example.demo.repo_module.Entities.Book;
import com.example.demo.repo_module.Repos.BookRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Book not found"));
    }

    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }
}
