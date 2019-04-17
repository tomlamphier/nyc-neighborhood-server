package com.datasciex.rest311a.controller;

import com.datasciex.rest311a.model.Boroughs;
import com.datasciex.rest311a.repository.BoroughsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class BoroughsController {
    @Autowired
    BoroughsRepository boroughsRepository;

    //@CrossOrigin(origins = "http://localhost:4200")
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/boroughs")
    public List<Boroughs> getBoroughs() {
        return boroughsRepository.findAll();
    }
}
