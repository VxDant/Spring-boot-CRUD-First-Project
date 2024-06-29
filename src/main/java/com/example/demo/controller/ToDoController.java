package com.example.demo.controller;


import com.example.demo.data.model.ToDos;
import com.example.demo.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private TodosService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDos createTask(@RequestBody ToDos todo){
        return service.addTodo(todo);
    }

    @GetMapping
    public List<ToDos> getTodos(){
        return  service.findAllToDos();
    }

}
