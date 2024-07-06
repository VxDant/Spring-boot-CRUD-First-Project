package com.example.demo.service;

import com.example.demo.data.model.ToDo;
import com.example.demo.repository.ToDosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {

    int id = 1;

    @Autowired
    private ToDosRepository repository;

    public ToDo addTodo(ToDo Todo){

        id += 1;

        Todo.setId(id+=1);
        return repository.save(Todo);
    }

    public List<ToDo> findAllToDos(){

        return repository.findAll();
    }

    public String deleteTodo(String name){

        repository.deleteTodoByTitle(name);

        return "todo removed";


    }
}
