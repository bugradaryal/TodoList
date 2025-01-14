package com.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
