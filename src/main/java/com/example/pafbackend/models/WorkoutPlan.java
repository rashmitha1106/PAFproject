package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "workoutPlans")
public class WorkoutPlan {
    @Id
    private String id;
    private String userId;
    private String planDetails;  // Consider using a structured type or JSON
    private Date modificationTimestamp;

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

    public String getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(String planDetails) {
        this.planDetails = planDetails;
    }

    public Date getModificationTimestamp() {
        return modificationTimestamp;
    }

    public void setModificationTimestamp(Date modificationTimestamp) {
        this.modificationTimestamp = modificationTimestamp;
    }

    public WorkoutPlan() {}

    public WorkoutPlan(String id, String userId, String planDetails, Date modificationTimestamp) {
        this.id = id;
        this.userId = userId;
        this.planDetails = planDetails;
        this.modificationTimestamp = modificationTimestamp;
    }


}

