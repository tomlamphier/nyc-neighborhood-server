package com.datasciex.repository;

import com.datasciex.model.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, String> {
    List<Complaint> findAllByOrderByType();
}
