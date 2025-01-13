package com.DataAccess.Concrete;

import com.DataAccess.Abstact.IUserRepository;
import com.Entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Override
    public User getUser(Integer id) {
        return null;
    }
}
