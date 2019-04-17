package com.datasciex.rest311a.controller;

import com.datasciex.rest311a.model.Complaint;
import com.datasciex.rest311a.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class ComplaintController {
    @Autowired
    ComplaintRepository complaintRepository;

    //@CrossOrigin(origins = "http://localhost:4200")
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/complaints")
    public List<Complaint> getComplaints() {
        return complaintRepository.findAllByOrderByType();
    }
}
