package org.example.data.datasource.remote.api;

import org.example.data.datasource.remote.dto.UniversityDto;
import org.example.domain.entity.University;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ApiService {

    @GET("search")
    Call<List<UniversityDto>> getUniversities(@Query(value = "country", encoded = true) String country);

}
