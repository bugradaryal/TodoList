package com.Business.Concrete;

import com.Business.Abstact.IUserServices;
import com.Core.Utilities.Exceptions.CustomExeptions;
import com.Core.Utilities.Mapper.ModelMapperServices;
import com.DTO.RegisterDTO;
import com.DTO.UpdateDTO;
import com.DataAccess.Abstact.IUserRepository;
import com.Entities.User;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements IUserServices {
    private IUserRepository userRepository;
    private ModelMapperServices modelMapperServices;
    @Autowired
    public UserManager(IUserRepository _userRepository, ModelMapperServices _modelMapperServices) {
        this.userRepository = _userRepository;
        this.modelMapperServices = _modelMapperServices;
    }

    @Override
    public User Login(String email, String password){
        try{
            if(userRepository.existsByEmail(email)){
                return userRepository.findByEmailAndPassword(email,password);
            }
            else{
                throw new CustomExeptions("Account doesn't exist");
            }
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public void CreateUser(RegisterDTO registerDTO){
        try{
            User user = modelMapperServices.getModelMapper().map(registerDTO,User.class);
            userRepository.save(user
            );
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public void DeleteUser(int userId){
        try{
            if(userRepository.existsById(userId)){
                userRepository.deleteById(userId);
            }
            else {
                throw new CustomExeptions("User not found");
            }
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }

    @Override
    public void UpdateUser(UpdateDTO updateDTO){
        try{
            User user = userRepository.findById(updateDTO.getId()).get();
            if(user != null){
                user = modelMapperServices.getModelMapper().map(updateDTO,user.getClass());
                userRepository.save(user);
            }
            else {
                throw new CustomExeptions("User not found");
            }
        }
        catch(Exception e){
            throw new CustomExeptions(e.getMessage());
        }
    }
}
