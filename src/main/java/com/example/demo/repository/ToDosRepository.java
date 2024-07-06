package com.example.demo.repository;

import com.example.demo.data.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDosRepository extends MongoRepository<ToDo, String> {

    ToDo deleteTodoByTitle(String title);


    void deleteByTitle(String title);
}
