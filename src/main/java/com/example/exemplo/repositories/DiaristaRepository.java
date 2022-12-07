package com.example.exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exemplo.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{
    
}
