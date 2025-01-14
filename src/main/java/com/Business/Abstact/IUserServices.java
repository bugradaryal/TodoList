package com.Business.Abstact;

import com.DTO.RegisterDTO;
import com.DTO.UpdateDTO;
import com.Entities.User;

public interface IUserServices {
    User Login(String email, String password);
    void CreateUser(RegisterDTO registerDTO);
    void DeleteUser(int userId);
    void UpdateUser(UpdateDTO updateDTO);
}
