package org.example.presentation;

import org.example.domain.usecase.GetUniversitiesUseCase;

public class UniversitiesScreen {

    private final GetUniversitiesUseCase getUniversitiesUseCase;

    public UniversitiesScreen(GetUniversitiesUseCase getUniversitiesUseCase) {
        this.getUniversitiesUseCase = getUniversitiesUseCase;
    }

    public void start() {
        System.out.println(getUniversitiesUseCase.execute("Armenia"));
    }

}
