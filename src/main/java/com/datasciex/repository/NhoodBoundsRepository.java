package com.datasciex.repository;

import com.datasciex.model.NhoodBounds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhoodBoundsRepository extends CrudRepository<NhoodBounds, String> {
    NhoodBounds findByNeighborhood(String neighborhood);
}
