package com.librarySpring.library.service;

import com.librarySpring.library.model.User;
import com.librarySpring.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> searchUsersByName(String namePart) {
        return userRepository.findByNameContainingIgnoreCase(namePart);
    }
}
