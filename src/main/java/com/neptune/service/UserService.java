package com.neptune.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.neptune.entity.User;
import com.neptune.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Ensure PasswordEncoder is defined in your security configuration

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Hash the password before saving
        return userRepository.save(user); // Save the user to the repository
    }

    public Optional<User> loginUser(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username); // Fetch the user by username
        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return user; // Return user if password matches
        }
        return Optional.empty(); // Return empty if credentials are invalid
    }
}
