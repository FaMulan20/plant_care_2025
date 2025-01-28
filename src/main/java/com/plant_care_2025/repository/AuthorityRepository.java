package com.plant_care_2025.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plant_care_2025.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}