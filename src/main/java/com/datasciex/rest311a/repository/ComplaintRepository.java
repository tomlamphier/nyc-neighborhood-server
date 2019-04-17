package com.datasciex.rest311a.repository;

import com.datasciex.rest311a.model.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, String> {
    List<Complaint> findAllByOrderByType();
    //List<Complaint> findAll();

}