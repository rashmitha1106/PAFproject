package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "workoutStatusUpdates")
public class WorkoutStatusUpdate {
    @Id
    private String id;
    private String userId;
    private Date timestamp;
    private String workoutType;
    private String metrics;  // Consider using a more structured type or JSON mapping
    private String description;

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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public String getMetrics() {
        return metrics;
    }

    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkoutStatusUpdate() {}

    public WorkoutStatusUpdate(String id, String userId, Date timestamp, String workoutType, String metrics, String description) {
        this.id = id;
        this.userId = userId;
        this.timestamp = timestamp;
        this.workoutType = workoutType;
        this.metrics = metrics;
        this.description = description;
    }

    // Getters and setters...
}
