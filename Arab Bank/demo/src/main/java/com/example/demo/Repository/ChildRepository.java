package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long>  {
    
}
