package com.example.api_Star_Wars.domains.planet;

public record PlanetDTO(Long id,String nome,String clima,String terreno) {

    public PlanetDTO (PlanetDTO planetDTO){
        this(planetDTO.id(), planetDTO.nome(), planetDTO.clima(), planetDTO.terreno());
    }
}
