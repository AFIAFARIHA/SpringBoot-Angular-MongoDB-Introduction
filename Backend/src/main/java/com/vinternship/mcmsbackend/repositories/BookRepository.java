package com.vinternship.mcmsbackend.repositories;

import com.vinternship.mcmsbackend.models.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.vinternship.mcmsbackend.models.Book;
import java.util.List;

public interface BookRepository extends MongoRepository<Book,String> {

   List<Book> findBookByTitleContaining(String title);

}
