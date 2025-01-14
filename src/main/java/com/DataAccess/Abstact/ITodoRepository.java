package com.DataAccess.Abstact;

import com.Entities.Todo;
import com.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITodoRepository extends JpaRepository<Todo,Integer> {
    List<Todo> findByUserId(int userId);
}
