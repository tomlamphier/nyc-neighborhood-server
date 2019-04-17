package com.datasciex.rest311a.repository;

import com.datasciex.rest311a.model.Neighborhood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodRepository extends CrudRepository<Neighborhood, String> {
    List<Neighborhood> findAllByOrderByNeighborhood();
    //List<Complaint> findAll();

}