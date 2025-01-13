package com.Business.Concrete;

import com.Business.Abstact.IUserServices;
import com.DataAccess.Abstact.IUserRepository;
import com.DataAccess.Concrete.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements IUserServices {
    private IUserRepository userRepository;
    public UserManager(UserRepository _userRepository) {
        userRepository = _userRepository;
    }
}
