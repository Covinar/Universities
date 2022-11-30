package org.example.data.datasource.remote.dto;

import com.google.gson.annotations.SerializedName;

public class UniversityDto {
    private String country;
    @SerializedName("alpha_two_code")
    private String alphaTwoCode;
    private String name;

    public String getCountry() {
        return country;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public String getName() {
        return name;
    }
}
