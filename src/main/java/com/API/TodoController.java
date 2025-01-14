package com.API;

import com.Business.Abstact.ITodoServices;
import com.Business.Concrete.TodoManager;
import com.DTO.AddTodoDTO;
import com.DTO.UpdateTodoDto;
import com.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Todo")
public class TodoController {
    private ITodoServices todoServices;

    @Autowired
    public TodoController(TodoManager todoManager){
        this.todoServices = todoManager;
    }

    @PostMapping("CreateTodo")
    public ResponseEntity<Void> CreateTodo(@RequestBody AddTodoDTO addTodoDTO){
        todoServices.CreateTodo(addTodoDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("DeleteTodo")
    public ResponseEntity<Void> DeleteTodo(@RequestParam int todoId){
        todoServices.DeleteTodo(todoId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("UpdateTodo")
    public ResponseEntity<Void> UpdateTodo(@RequestBody UpdateTodoDto updateTodoDto){
        todoServices.UpdateTodo(updateTodoDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("GetTodoByUserId")
    public ResponseEntity<List<Todo>> GetTodoByUserId(@RequestParam int userId){
        List<Todo> todos = todoServices.GetAllTodoById(userId);
        return ResponseEntity.ok(todos);
    }
}
