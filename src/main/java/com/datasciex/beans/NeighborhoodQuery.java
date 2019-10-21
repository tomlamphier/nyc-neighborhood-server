package com.datasciex.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NeighborhoodQuery {
    private String[] neighborhoods;

    @JsonCreator
    public NeighborhoodQuery(@JsonProperty("neighborhoods") String[] neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public String[] getNeighborhoods() {
        return neighborhoods;
    }

}
