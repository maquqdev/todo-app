package eu.boxhunt.todoapp.repository;

import eu.boxhunt.todoapp.object.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> { }