package com.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddTodoDTO {

    @NotBlank
    @Size(min = 1, max = 350)
    private String title;

    @NotBlank
    @Size(max = 650)
    private String description;

    @NotBlank
    @Size(min = 1, max = 1250)
    private String content;
}
