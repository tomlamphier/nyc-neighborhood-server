package com.datasciex.rest311a.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="complaints")
public class Complaint {

    @Id
    private String id;

    private String type;
    private String level;

    public Complaint() {}

    public Complaint(String type, String level) {
        this.setType(type);
        this.setLevel(level);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}