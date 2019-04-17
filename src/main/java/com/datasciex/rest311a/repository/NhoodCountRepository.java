package com.datasciex.rest311a.repository;

import com.datasciex.rest311a.model.NhoodCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhoodCountRepository extends CrudRepository<NhoodCount, String> {
    List<NhoodCount> findByNeighborhoodAndComplaint(String neighborhood, String complaint);
}