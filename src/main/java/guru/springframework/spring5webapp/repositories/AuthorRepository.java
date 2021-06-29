package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    // data repository implements repository pattern (in contast to dao pattern, and will be responsible for queries and persistance
    //CrudRepository<T,ID> :Interface for generic CRUD operations on a repository for a specific type.
    // we only provide the interface, JPA will provide the implementaton for us
}
