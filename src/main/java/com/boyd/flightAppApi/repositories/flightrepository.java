package com.boyd.flightAppApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boyd.flightAppApi.models.flight;

public interface flightrepository extends JpaRepository<flight, Long> {
    
}
