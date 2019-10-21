package com.datasciex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="nhoodgeo")
public class NhoodGeo {

    @Id
    private String id;

    private String neighborhood;
    private String geodata;

    public NhoodGeo() {}

    public NhoodGeo(String neighborhood, String geodata) {
        this.setNeighborhood(neighborhood);
        this.setGeodata(geodata);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }
}
