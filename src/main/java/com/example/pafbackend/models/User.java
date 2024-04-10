package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String username;
    private String email;
    private String hashedPassword;
    private String profilePictureUrl;
    private String bio;
    private String fitnessGoals;
    private boolean profileVisibility;

    // No-arg constructor
    public User() {
    }

    // All-args constructor
    public User(String id, String username, String email, String hashedPassword,
                String profilePictureUrl, String bio, String fitnessGoals, boolean profileVisibility) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.profilePictureUrl = profilePictureUrl;
        this.bio = bio;
        this.fitnessGoals = fitnessGoals;
        this.profileVisibility = profileVisibility;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public String getBio() {
        return bio;
    }

    public String getFitnessGoals() {
        return fitnessGoals;
    }

    public boolean isProfileVisibility() {
        return profileVisibility;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setFitnessGoals(String fitnessGoals) {
        this.fitnessGoals = fitnessGoals;
    }

    public void setProfileVisibility(boolean profileVisibility) {
        this.profileVisibility = profileVisibility;
    }
}
