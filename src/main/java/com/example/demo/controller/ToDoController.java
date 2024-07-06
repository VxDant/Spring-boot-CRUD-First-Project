package com.example.demo.controller;


import com.example.demo.data.model.ToDo;
import com.example.demo.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private TodosService service;

    @PostMapping("/addtodo")
    @ResponseStatus(HttpStatus.CREATED)
    public ToDo createTask(@RequestBody ToDo todo){
        return service.addTodo(todo);
    }

    @GetMapping("/todos")
    public List<ToDo> getTodos(){
        return  service.findAllToDos();
    }

    @DeleteMapping("/delete/{title}")
    public String deleteTodo(@PathVariable String title) {
        return service.deleteTodo(title);
    }




}
