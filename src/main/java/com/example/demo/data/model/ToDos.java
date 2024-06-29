package com.example.demo.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDos {

    private String title;
    private String description;
    @Id
    private int id = 0;
    private String priority;
}
