package com.example.adaptivelearningbackend.service;

import com.example.adaptivelearningbackend.dto.RegisterRequestDTO;
import com.example.adaptivelearningbackend.dto.UserDTO;

public interface UserService {
    UserDTO registerUser(RegisterRequestDTO registerRequest);
    UserDTO getUserById(Long id);
    // Add other methods like:
    // UserDTO loginUser(LoginRequestDTO loginRequest);
    // UserDTO findUserById(Long id);
    // UserDTO getCurrentUser(); // Important for getting authenticated user context
}