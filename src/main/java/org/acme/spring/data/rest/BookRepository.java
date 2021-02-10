package org.acme.spring.data.rest;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.Optional;

//@RepositoryRestResource(exported=false, path = "/all-books", collectionResourceRel = "books")
public interface BookRepository extends CrudRepository<Book, Long> {

    /*@RestResource(exported = true)
    Page<Book> findAll(Pageable pageable);

    @RestResource(exported = true)
    Optional<Book> findById(ID id);

    @RestResource(exported = true)
    Book save(Book book);*/
}
