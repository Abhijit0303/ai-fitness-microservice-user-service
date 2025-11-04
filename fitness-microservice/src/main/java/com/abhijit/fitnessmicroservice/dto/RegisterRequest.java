package com.abhijit.fitnessmicroservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email format")
    private String email;

    @NotBlank
    @Size(min = 6, message = "Password must have atleast of 6 charecters")
    private String password;
    private String firstName;
    private String lastName;
}
