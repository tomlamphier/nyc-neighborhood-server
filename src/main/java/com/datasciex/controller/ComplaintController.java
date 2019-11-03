package com.datasciex.controller;

import com.datasciex.model.Complaint;
import com.datasciex.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class ComplaintController {
    @Autowired
    ComplaintRepository complaintRepository;

    @CrossOrigin
    @GetMapping("/complaints")
    public List<Complaint> getComplaints() {
        return complaintRepository.findAllByOrderByType();
    }
}
