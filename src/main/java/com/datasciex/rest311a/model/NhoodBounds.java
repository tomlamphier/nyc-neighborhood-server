package com.datasciex.rest311a.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="nhoodbounds")
public class NhoodBounds {

    @Id
    private String id;

    private String neighborhood;
    private double area;
    private double minlng;
    private double maxlng;
    private double minlat;
    private double maxlat;

    public NhoodBounds() {}

    public NhoodBounds(double area, double minlng, double maxlng, double minlat, double maxlat) {
        this.setArea(area);
        this.setMinlng(minlng);
        this.setMinlat(minlat);
        this.setMaxlat(maxlat);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getMinlng() {
        return minlng;
    }

    public void setMinlng(double minlng) {
        this.minlng = minlng;
    }

    public double getMaxlng() {
        return maxlng;
    }

    public void setMaxlng(double maxlng) {
        this.maxlng = maxlng;
    }

    public double getMinlat() {
        return minlat;
    }

    public void setMinlat(double minlat) {
        this.minlat = minlat;
    }

    public double getMaxlat() {
        return maxlat;
    }

    public void setMaxlat(double maxlat) {
        this.maxlat = maxlat;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}