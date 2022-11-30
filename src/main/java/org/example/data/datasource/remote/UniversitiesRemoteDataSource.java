package org.example.data.datasource.remote;

import org.example.data.datasource.remote.dto.UniversityDto;
import java.util.List;

public interface UniversitiesRemoteDataSource {

    List<UniversityDto> getUniversities(String country);

}
