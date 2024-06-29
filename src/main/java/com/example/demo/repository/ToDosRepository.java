package com.example.demo.repository;

import com.example.demo.data.model.ToDos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDosRepository extends MongoRepository<ToDos, String> {


}
