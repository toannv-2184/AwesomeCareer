package com.aa.awesomecareer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aa.awesomecareer.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {

}
