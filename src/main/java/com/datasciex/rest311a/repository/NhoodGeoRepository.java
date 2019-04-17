package com.datasciex.rest311a.repository;

import com.datasciex.rest311a.model.NhoodGeo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhoodGeoRepository extends CrudRepository<NhoodGeo, String> {
    public List<NhoodGeo> findByNeighborhood(String neighborhood);
}