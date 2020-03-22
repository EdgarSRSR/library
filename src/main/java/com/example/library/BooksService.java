package com.example.library;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    @Autowired
    private BooksRepository repo;

    public List<Books> listAll(){
        return repo.findAll();
    }

    public void save(Books book){
        repo.save(book);
    }

    public Books get(Long booksId){
        return repo.findById(booksId).get();
    }

    public void delete(Long booksId){
        repo.deleteById(booksId);
    }

}
