package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    //CrudRepository<type, idValue ( we defined this as @id>
    // we only provide the interface, JPA will provide the implementation for us

}
