package com.Business.Abstact;

import com.DTO.AddTodoDTO;
import com.DTO.UpdateTodoDto;
import com.Entities.Todo;

import java.util.List;

public interface ITodoServices {
    void CreateTodo(AddTodoDTO addTodoDTO);
    void DeleteTodo(int todoId);
    void UpdateTodo(UpdateTodoDto updateTodoDto);
    List<Todo> GetAllTodoById(int userId);
}
