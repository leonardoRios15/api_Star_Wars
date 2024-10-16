package com.example.api_Star_Wars.repositories;

import com.example.api_Star_Wars.domains.planet.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet,Long> {


}
