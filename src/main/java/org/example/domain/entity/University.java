package org.example.domain.entity;

public class University {
    private String country;
    private String alphaTwoCode;
    private String name;

    public University(String country, String alphaTwoCode, String name) {
        this.country = country;
        this.alphaTwoCode = alphaTwoCode;
        this.name = name;
    }

    @Override
    public String toString() {
        return "University{" +
                "country='" + country + '\'' +
                ", alphaTwoCode='" + alphaTwoCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
