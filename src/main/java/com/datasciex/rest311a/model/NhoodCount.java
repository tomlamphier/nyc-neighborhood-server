package com.datasciex.rest311a.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="nhoodcounts")
public class NhoodCount {

    @Id
    private String id;

    private int count;
    private String neighborhood;
    private String complaint;

    public NhoodCount() {}

    public NhoodCount(int count, String neighborhood, String complaint) {
        this.setCount(count);
        this.setNeighborhood(neighborhood);
        this.setComplaint(complaint);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}