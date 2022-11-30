package org.example.domain.usecase;

import org.example.domain.entity.University;

import java.util.List;

public interface GetUniversitiesUseCase {

    List<University> execute(String country);

}
