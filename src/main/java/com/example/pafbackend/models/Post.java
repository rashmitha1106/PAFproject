package com.example.pafbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "posts")
public class Post {
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public String getMediaLinks() {
        return mediaLinks;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public void setMediaLinks(String mediaLinks) {
        this.mediaLinks = mediaLinks;
    }

    @Id
    private String id;
    private String userId;
    private Date timestamp;
    private String contentDescription;
    private String mediaLinks;  // Consider changing this to a List<String> if there are multiple links

    public Post() {}

    public Post(String id, String userId, Date timestamp, String contentDescription, String mediaLinks) {
        this.id = id;
        this.userId = userId;
        this.timestamp = timestamp;
        this.contentDescription = contentDescription;
        this.mediaLinks = mediaLinks;
    }


}

