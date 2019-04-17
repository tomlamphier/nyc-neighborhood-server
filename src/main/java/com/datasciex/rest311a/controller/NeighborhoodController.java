package com.datasciex.rest311a.controller;

import com.datasciex.rest311a.model.Neighborhood;
import com.datasciex.rest311a.repository.NeighborhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class NeighborhoodController {
    @Autowired
    NeighborhoodRepository neighborhoodRepository;

    //@CrossOrigin(origins = "http://localhost:4200")
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/neighborhoods")
    public List<Neighborhood> getNeighborhoods() {
        return neighborhoodRepository.findAllByOrderByNeighborhood();
    }
}
