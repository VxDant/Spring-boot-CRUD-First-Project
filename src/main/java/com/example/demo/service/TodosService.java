package com.example.demo.service;

import com.example.demo.data.model.ToDos;
import com.example.demo.repository.ToDosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {

    int id = 1;

    @Autowired
    private ToDosRepository repository;

    public ToDos addTodo(ToDos Todo){

        id += 1;

        Todo.setId(id+=1);
        return repository.save(Todo);
    }

    public List<ToDos> findAllToDos(){

        return repository.findAll();
    }
}
