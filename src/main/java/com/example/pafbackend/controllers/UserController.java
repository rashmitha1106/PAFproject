package com.example.pafbackend.controllers;

import com.example.pafbackend.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.example.pafbackend.models.User;
import com.example.pafbackend.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Retrieve all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Retrieve a user by ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    // Update a user by ID
    /*@PutMapping("/{id}")
    public UserProfile updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(updatedUser.getUsername());
                    user.setEmail(updatedUser.getEmail());
                    user.setHashedPassword(updatedUser.getHashedPassword());
                    user.setProfilePictureUrl(updatedUser.getProfilePictureUrl());
                    user.setBio(updatedUser.getBio());
                    user.setFitnessGoals(updatedUser.getFitnessGoals());
                    user.setProfileVisibility(updatedUser.isProfileVisibility());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    updatedUser.setId(id);
                    return userRepository.save(updatedUser);
                });
    }*/

    // Delete a user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }


}
