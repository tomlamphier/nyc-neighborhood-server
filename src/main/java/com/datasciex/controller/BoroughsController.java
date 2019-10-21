package com.datasciex.controller;

import com.datasciex.model.Boroughs;
import com.datasciex.repository.BoroughsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class BoroughsController {
    @Autowired
    BoroughsRepository boroughsRepository;

    @CrossOrigin(origins = "http://localhost")
    @GetMapping("/boroughs")
    public List<Boroughs> getBoroughs() {
        return boroughsRepository.findAll();
    }
}
