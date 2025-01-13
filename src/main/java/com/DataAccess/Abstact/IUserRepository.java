package com.DataAccess.Abstact;

import com.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository{
    User getUser(Integer id);
}
