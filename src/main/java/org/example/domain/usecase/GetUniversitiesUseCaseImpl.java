package org.example.domain.usecase;

import org.example.data.repository.UniversitiesRepository;
import org.example.domain.entity.University;

import java.util.List;

public class GetUniversitiesUseCaseImpl implements GetUniversitiesUseCase{
    private final UniversitiesRepository repository;

    public GetUniversitiesUseCaseImpl(UniversitiesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<University> execute(String country) {
        return repository.getUniversities(country);
    }
}
