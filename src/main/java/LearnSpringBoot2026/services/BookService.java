package LearnSpringBoot2026.services;

import LearnSpringBoot2026.entity.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(int id);

    Book updateBook(int id, Book book);

    void deleteBook(int id);
}
