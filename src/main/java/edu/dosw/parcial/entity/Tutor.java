package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Tutores")
public class Tutor extends Usuario{
    @NotNull 
    @OneToMany 
    @JoinColumn(name = "id", nullable = false)
    private List<Disponibilidad> disponibilidades;

    public Tutor (){
        this.disponibilidades = new ArrayList<>();
    }

    public void setDisponibilidades(List<Disponibilidad> disponibilidades){
        this.disponibilidades = disponibilidades;
    }

    public List<Disponibilidad> getDisponibilidades(){
        return this.disponibilidades;
    }
}
