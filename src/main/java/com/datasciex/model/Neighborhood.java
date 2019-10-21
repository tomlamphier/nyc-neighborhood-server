package com.datasciex.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="neighborhoods")
public class Neighborhood {
    @Id
    private String id;

    private String neighborhood;
    private String borough;

    public Neighborhood() {}

    public Neighborhood(String neighborhood, String borough) {
        this.setNeighborhood(neighborhood);
        this.setBorough(borough);
    }


    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
