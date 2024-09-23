package service;
import com.example.demo2.entity.Book;
import com.example.demo2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookService() { }

    public void getBooks() {
        List<Book> books = bookRepository.findAll();
    }

    public List<Book> addBooks(String name, String genre) {
        return null;
    }

}
