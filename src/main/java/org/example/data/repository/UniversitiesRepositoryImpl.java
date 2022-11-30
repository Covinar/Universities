package org.example.data.repository;

import org.example.data.datasource.remote.UniversitiesRemoteDataSource;
import org.example.data.datasource.remote.dto.UniversityDto;
import org.example.data.datasource.remote.mapper.UniversityMapper;
import org.example.domain.entity.University;

import java.util.List;

public class UniversitiesRepositoryImpl implements UniversitiesRepository{
    private final UniversitiesRemoteDataSource remoteDataSource;
    private final UniversityMapper mapper;

    public UniversitiesRepositoryImpl(UniversitiesRemoteDataSource remoteDataSource, UniversityMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public List<University> getUniversities(String country) {
        List<UniversityDto> responses = remoteDataSource.getUniversities(country);
        return mapper.toEntities(responses);
    }
}
