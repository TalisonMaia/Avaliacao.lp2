package AvaliacaoApplication.java.repository;

import AvaliacaoApplication.java.model.todo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends MongoRepository<todo, String> {

}
