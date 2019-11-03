package com.datasciex.controller;

import com.datasciex.model.Neighborhood;
import com.datasciex.repository.NeighborhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class NeighborhoodController {
    @Autowired
    NeighborhoodRepository neighborhoodRepository;

    @CrossOrigin
    @GetMapping("/neighborhoods")
    public List<Neighborhood> getNeighborhoods() {
        return neighborhoodRepository.findAllByOrderByNeighborhood();
    }
}
