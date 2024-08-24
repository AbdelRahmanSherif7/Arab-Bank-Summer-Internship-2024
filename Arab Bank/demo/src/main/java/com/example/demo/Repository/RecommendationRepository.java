package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    
}
