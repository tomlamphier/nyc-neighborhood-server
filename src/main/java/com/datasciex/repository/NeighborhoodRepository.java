package com.datasciex.repository;

import com.datasciex.model.Neighborhood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodRepository extends CrudRepository<Neighborhood, String> {
    List<Neighborhood> findAllByOrderByNeighborhood();
}
