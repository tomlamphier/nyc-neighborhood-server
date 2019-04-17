package com.datasciex.rest311a.beans;

import java.util.ArrayList;

public class NeighborhoodQueryRes {
    private String geodata;
    private double minlng;
    private double maxlng;
    private double minlat;
    private double maxlat;

    public NeighborhoodQueryRes() { }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

    public String getGeodata() {
        return geodata;
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
}
