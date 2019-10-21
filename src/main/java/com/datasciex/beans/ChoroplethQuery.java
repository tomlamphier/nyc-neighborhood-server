package com.datasciex.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChoroplethQuery {
    private String[] neighborhoods;
    private String[] complaints;

    @JsonCreator
    public ChoroplethQuery(@JsonProperty("neighborhoods") String[] neighborhoods,
                           @JsonProperty("complaints") String[] complaints) {
        this.neighborhoods = neighborhoods;
        this.complaints = complaints;
    }

    public String[] getNeighborhoods() {
        return neighborhoods;
    }
    public String[] getComplaints() {return complaints;}

}
