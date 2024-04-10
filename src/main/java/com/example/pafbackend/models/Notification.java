package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;
    private String userId;
    private String type;  // like/comment etc.
    private String associatedPostId;
    private Date timestamp;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAssociatedPostId() {
        return associatedPostId;
    }

    public void setAssociatedPostId(String associatedPostId) {
        this.associatedPostId = associatedPostId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Notification() {}

    public Notification(String id, String userId, String type, String associatedPostId, Date timestamp) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.associatedPostId = associatedPostId;
        this.timestamp = timestamp;
    }

    // Getters and setters...
}
