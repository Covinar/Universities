package org.example.data.repository;

import org.example.domain.entity.University;

import java.util.List;

public interface UniversitiesRepository {

    List<University> getUniversities(String country);

}
