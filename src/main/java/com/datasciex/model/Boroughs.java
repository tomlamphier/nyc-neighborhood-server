package com.datasciex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="boroughs")
public class Boroughs {

    @Id
    private String id;
    private String name;
    private String geodata;


    public Boroughs() {}

    public Boroughs(String geodata) {
        this.setGeodata(geodata);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

}
