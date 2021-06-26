package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    //CrudRepository<type, idValue ( we defined this as @id>
    // we only provide the interface, JPA will provide the implementaton for us
}
