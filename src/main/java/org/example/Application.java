package org.example;

import org.example.data.datasource.remote.UniversitiesRemoteDataSource;
import org.example.data.datasource.remote.UniversitiesRemoteDataSourceImpl;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.api.RetrofitClient;
import org.example.data.datasource.remote.mapper.UniversityMapper;
import org.example.data.repository.UniversitiesRepository;
import org.example.data.repository.UniversitiesRepositoryImpl;
import org.example.domain.usecase.GetUniversitiesUseCase;
import org.example.domain.usecase.GetUniversitiesUseCaseImpl;
import org.example.presentation.UniversitiesScreen;

public class Application {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        UniversitiesRemoteDataSource dataSource = new UniversitiesRemoteDataSourceImpl(apiService);
        UniversityMapper mapper = new UniversityMapper();
        UniversitiesRepository repository = new UniversitiesRepositoryImpl(dataSource, mapper);
        GetUniversitiesUseCase useCase = new GetUniversitiesUseCaseImpl(repository);
        UniversitiesScreen screen = new UniversitiesScreen(useCase);
        screen.start();
    }
}