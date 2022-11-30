package org.example.data.datasource.remote.mapper;

import org.example.data.datasource.remote.dto.UniversityDto;
import org.example.domain.entity.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityMapper {

    University map(UniversityDto dto) {
        University entity = new University(dto.getCountry(), dto.getAlphaTwoCode(), dto.getName());
        return entity;
    }

    public List<University> toEntities(List<UniversityDto> responses) {
        List<University> universities = new ArrayList<>();
        for(UniversityDto dto: responses) {
            University university = map(dto);
            universities.add(university);
        }
        return universities;
    }

}
