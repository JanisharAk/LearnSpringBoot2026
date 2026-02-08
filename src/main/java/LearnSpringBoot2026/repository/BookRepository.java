package LearnSpringBoot2026.repository;

import LearnSpringBoot2026.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
