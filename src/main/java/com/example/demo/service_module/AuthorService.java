package com.example.demo.service_module;

import com.example.demo.repo_module.Entities.Author;
import com.example.demo.repo_module.Repos.AuthorRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AuthorService {
    private final AuthorRepo authorRepo;

    public List<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    public Author findAuthorById(Long id) {
        return authorRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("No author found with id: " + id));
    }

    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }

    public void deleteAuthorById(Long id) {
        authorRepo.deleteById(id);
    }
}
