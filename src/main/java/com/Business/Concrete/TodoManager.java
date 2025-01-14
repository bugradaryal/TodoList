package com.Business.Concrete;

import com.Business.Abstact.ITodoServices;
import com.Core.Utilities.Exceptions.CustomExeptions;
import com.Core.Utilities.Mapper.ModelMapperServices;
import com.DTO.AddTodoDTO;
import com.DTO.UpdateTodoDto;
import com.DataAccess.Abstact.ITodoRepository;
import com.DataAccess.Abstact.IUserRepository;
import com.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoManager implements ITodoServices {
    private ITodoRepository todoRepository;
    private ModelMapperServices modelMapperServices;

    @Autowired
    public TodoManager(ITodoRepository _todoRepository, ModelMapperServices _modelMapperServices) {
        this.todoRepository = _todoRepository;
        this.modelMapperServices = _modelMapperServices;
    }

    @Override
    public void CreateTodo(AddTodoDTO addTodoDTO){
        try{
            Todo todo = modelMapperServices.getModelMapper().map(addTodoDTO,Todo.class);
            todoRepository.save(todo);
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public void DeleteTodo(int todoId){
        try{
            todoRepository.deleteById(todoId);
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public void UpdateTodo(UpdateTodoDto updateTodoDto){
        try{
            Todo todo = todoRepository.findById(updateTodoDto.getId()).get();
            todo = modelMapperServices.getModelMapper().map(updateTodoDto,todo.getClass());
            todoRepository.save(todo);
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public List<Todo> GetAllTodoById(int userId){
        return todoRepository.findByUserId(userId);
    }
}
