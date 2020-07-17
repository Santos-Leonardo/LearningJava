package com.leonardo.learning.searchs;

public class Airport implements Comparable<Airport> {

    private String name;
    private String city;
    private String code;


    public Airport(String name, String city, String code) {
        this.name = name;
        this.city = city;
        this.code = code;
    }


    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public int compareTo(Airport o) {
        return (this.getName()).compareTo(o.getName());
    }
}
