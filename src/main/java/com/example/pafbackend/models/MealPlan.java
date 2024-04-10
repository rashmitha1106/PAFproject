package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mealPlans")
public class MealPlan {
    @Id
    private String id;
    private String userId;
    private String mealDetails;  // Consider using a structured type or JSON
    private String dietaryPreferences;

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

    public String getMealDetails() {
        return mealDetails;
    }

    public void setMealDetails(String mealDetails) {
        this.mealDetails = mealDetails;
    }

    public String getDietaryPreferences() {
        return dietaryPreferences;
    }

    public void setDietaryPreferences(String dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }

    public MealPlan() {}

    public MealPlan(String id, String userId, String mealDetails, String dietaryPreferences) {
        this.id = id;
        this.userId = userId;
        this.mealDetails = mealDetails;
        this.dietaryPreferences = dietaryPreferences;
    }

    // Getters and setters...
}
