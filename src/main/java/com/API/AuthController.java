package com.API;

import com.Business.Abstact.IUserServices;
import com.Business.Concrete.UserManager;
import com.DTO.LoginDTO;
import com.DTO.RegisterDTO;
import com.DTO.UpdateDTO;
import com.Entities.User;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {
    private IUserServices userServices;
    @Autowired
    public AuthController(UserManager userManager)
    {
        this.userServices = userManager;
    }
    @PostMapping("/Login")
    public ResponseEntity<User> Login(@RequestBody() LoginDTO loginDTO) {
        return ResponseEntity.ok(userServices.Login(loginDTO.getEmail(), loginDTO.getPassword()));
    }

    @PostMapping("/Register")
    public ResponseEntity<Void> Register(@RequestBody() RegisterDTO registerDTO) {
        userServices.CreateUser(registerDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/DeleteAccount")
    public ResponseEntity<Void> DeleteAccount(@RequestParam int userId){
        userServices.DeleteUser(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("UpdateAccount")
    public ResponseEntity<Void> UpdateAccount(@RequestBody UpdateDTO updateDTO){
        userServices.UpdateUser(updateDTO);
        return ResponseEntity.ok().build();
    }
}
