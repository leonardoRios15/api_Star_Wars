package com.example.api_Star_Wars.controllers;


import com.example.api_Star_Wars.domains.planet.Planet;
import com.example.api_Star_Wars.domains.planet.PlanetDTO;
import com.example.api_Star_Wars.repositories.PlanetRepository;
import com.example.api_Star_Wars.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universo")
public class PlanetController {


    @Autowired
    private PlanetRepository planetRepository;

    @Autowired
    private PlanetService planetService;

    @GetMapping
    public List<Planet> planetList(){
        return planetRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addPlanet(@RequestBody PlanetDTO planetDTO,String name,String clima,String terreno){
        Planet planet = new Planet();
        planet.setName(name);
        planet.setClima(clima);
        planet.setTerreno(terreno);
        planetService.addPlanets(planetDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Planeta adicionado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlanet(@PathVariable Long id){
        planetService.deletaPlanet(id);
        return ResponseEntity.ok("Planeta apagado com sucesso!");
    }





}
