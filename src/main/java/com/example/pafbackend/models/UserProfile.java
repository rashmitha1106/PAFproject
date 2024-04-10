package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userProfiles")
public class UserProfile {
    @Id
    private String id;
    private String userId;
    private String biography;
    private String fitnessGoals;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getFitnessGoals() {
        return fitnessGoals;
    }

    public void setFitnessGoals(String fitnessGoals) {
        this.fitnessGoals = fitnessGoals;
    }

    public boolean isProfileVisibility() {
        return profileVisibility;
    }

    public void setProfileVisibility(boolean profileVisibility) {
        this.profileVisibility = profileVisibility;
    }

    private boolean profileVisibility;

    public UserProfile() {}

    public UserProfile(String id, String userId, String biography, String fitnessGoals, boolean profileVisibility) {
        this.id = id;
        this.userId = userId;
        this.biography = biography;
        this.fitnessGoals = fitnessGoals;
        this.profileVisibility = profileVisibility;
    }

    // Getters and setters...
}
