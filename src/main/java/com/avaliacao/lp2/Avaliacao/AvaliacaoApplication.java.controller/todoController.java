package AvaliacaoApplication.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import AvaliacaoApplication.java.model.todo;
import AvaliacaoApplication.java.repositry.todoRepository;

@RestController
public class todoController{

    @Autowired
    private todoReponsitory todoRepo;

    @GetMapping("/todos")
    public ResponseEntity<?> getAllTodos(){
        List<todo> todos = todoRepo.findAll();
        if(todos.size() > 0){
            return new ResponseEntity<List<todo>>(todos, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No todos avaliable", HttpStatus.NOT_FOUND);
        }
    }
}