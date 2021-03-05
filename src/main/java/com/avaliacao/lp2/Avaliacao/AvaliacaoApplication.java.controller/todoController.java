package AvaliacaoApplication.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResposeEntity;

import AvaliacaoApplication.java.model.todo;
import AvaliacaoApplication.java.repositry.todoRepositry;

@RestCotroller
public class todoController{

    @Autowired
    private todoRepositry todoRepo;

    @GetMapping("/todos")
    public ResposeEntity<?> getAllTodos(){
        List<todo> todos = todoRepo.findAll();
        if(todos.size() > 0){
            return new ResposeEntity<List<todo>>(todos, HttpStatus.OK);
        }else{
            return new ResposeEntity<>("No todos avaliable", HttpStatus.NOT_FOUND);
        }
    }
}