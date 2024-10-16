package com.example.api_Star_Wars.service;

import com.example.api_Star_Wars.domains.planet.Planet;
import com.example.api_Star_Wars.domains.planet.PlanetDTO;
import com.example.api_Star_Wars.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {


    @Autowired
    private PlanetRepository planetRepository;


    public List<Planet> listPlanets(String name,String clima,String terreno){           //MELHORAR ESSE METODO DE BUSCA
        if(name != null){
            throw new ResourceNotFoundException("A busca não pode ser nula");
        }
        return planetRepository.findAll();
    }

    public Planet searchPlanets(Long id) {                             //metodo simples para buscar um planeta pelo id, fazendo tratamento de erro se o planeta não existir
        return planetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Esse planeta não existe"));
    }

    public void addPlanets(PlanetDTO planetDTO){   //criando um metodo para adicionar um planeta novo
        Planet planet = new Planet();
        planet.setName(planetDTO.name());
        planet.setClima(planetDTO.clima());
        planet.setTerreno(planetDTO.terreno());
        planetRepository.save(planet);
    }

    public void deletaPlanet(Long id){   //criando um metodo para deletar um planeta
        if(planetRepository.existsById(id)){
            planetRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Planeta não encontrado");
        }
    }
}
