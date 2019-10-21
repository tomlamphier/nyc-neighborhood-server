package com.datasciex.repository;

import com.datasciex.model.NhoodGeo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhoodGeoRepository extends CrudRepository<NhoodGeo, String> {
    public List<NhoodGeo> findByNeighborhood(String neighborhood);
}
