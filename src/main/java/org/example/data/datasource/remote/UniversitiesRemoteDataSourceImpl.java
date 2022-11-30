package org.example.data.datasource.remote;

import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.dto.UniversityDto;

import java.io.IOException;
import java.util.List;

public class UniversitiesRemoteDataSourceImpl implements UniversitiesRemoteDataSource {
    private final ApiService apiService;

    public UniversitiesRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public List<UniversityDto> getUniversities(String country) {
        try {
            return apiService.getUniversities(country).execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
