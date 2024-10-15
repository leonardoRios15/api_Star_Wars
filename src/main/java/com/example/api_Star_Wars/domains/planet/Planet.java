package com.example.api_Star_Wars.domains.planet;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "planets")
@Table(name = "planets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Planet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String clima;
    private String terreno;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getClima() {
        return clima;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getTerreno() {
        return terreno;
    }
}
