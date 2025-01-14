package com.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterDTO {
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;
    @NotBlank
    @Size(min = 2, max = 50)
    private String surname;
    @NotBlank
    @Size(min = 3, max = 24)
    private String username;
    @NotBlank
    @Size(min = 5, max = 16)
    private String password;
    @NotBlank
    @Size(min = 6, max = 92)
    private String email;
}
