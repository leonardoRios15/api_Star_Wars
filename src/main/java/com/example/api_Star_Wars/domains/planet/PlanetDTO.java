package com.example.api_Star_Wars.domains.planet;

import java.util.Optional;

public record PlanetDTO(Long id, String name, String clima, String terreno) {

    public PlanetDTO (PlanetDTO planetDTO){
        this(planetDTO.id(), planetDTO.name(), planetDTO.clima(), planetDTO.terreno());
    }




}
