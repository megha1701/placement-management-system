package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.College;

public interface CollegeRepository extends JpaRepository<College,Long > {

}
