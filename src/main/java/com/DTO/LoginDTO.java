package com.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDTO {
    @NotBlank
    @Size(min = 6, max = 92)
    private String email;
    @NotBlank
    @Size(min = 5, max = 16)
    private String password;
}
