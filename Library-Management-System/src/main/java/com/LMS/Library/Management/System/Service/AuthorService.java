package com.LMS.Library.Management.System.Service;

import com.LMS.Library.Management.System.Entity.Author;
import com.LMS.Library.Management.System.Entity.Book;
import com.LMS.Library.Management.System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public void addAuthor(Author author){
        authorRepository.save(author);
    }
    public List<Author> getAuthors(){
     return authorRepository.findAll();
    }
}
