package com.datasciex.repository;

import com.datasciex.model.NhoodCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhoodCountRepository extends CrudRepository<NhoodCount, String> {
    List<NhoodCount> findByNeighborhoodAndComplaint(String neighborhood, String complaint);
}
