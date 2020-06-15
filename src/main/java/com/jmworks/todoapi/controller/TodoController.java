package com.jmworks.todoapi.controller;

import com.jmworks.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RequestMapping("/todoapi")
@RestController
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @DeleteMapping("/todos/all")
    public Map<String, Boolean> deleteAllTodos() {
        todoRepository.deleteAll();

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/todos/message")
    @PreAuthorize("hasRole('USER')")
    public String message() {
        return "Secret Message ...";
    }

    @PostMapping("/todos/message")
    public String createMessage(@RequestBody String message) {
        return String.format("Message was created ... Content: %s", message);
    }
}
