package com.dhanraj.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanraj.demo.entity.Jobs;



public interface JobRepository extends JpaRepository<Jobs, Integer> {

}
