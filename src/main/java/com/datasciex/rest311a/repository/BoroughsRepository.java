package com.datasciex.rest311a.repository;

import com.datasciex.rest311a.model.Boroughs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoroughsRepository extends CrudRepository<Boroughs, String> {
    List<Boroughs> findAll();
    //List<Complaint> findAll();

}