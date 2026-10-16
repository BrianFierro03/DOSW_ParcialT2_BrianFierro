package edu.dosw.parcial.model;

import java.util.ArrayList;
import java.util.List;

public class TutorModel extends UsuarioModel{
    private List<DisponibilidadModel> disponibilidades;
    public TutorModel(){
        this.disponibilidades = new ArrayList<>();
    }

    public List<DisponibilidadModel> getDisponibilidades(){
        return this.disponibilidades;
    }

    public void addDisponibilidad(DisponibilidadModel disponibilidad){
        this.disponibilidades.add(disponibilidad);
    }

    public void addDisponibilidades(List<DisponibilidadModel> disponibilidades){
        for (DisponibilidadModel dis: disponibilidades){
            if (!this.disponibilidades.contains(dis)){
                this.disponibilidades.add(dis);
            }
        }
    }

    public void setDisponibilidades(ArrayList<DisponibilidadModel> disponibilidades){
        this.disponibilidades = disponibilidades;
    }
}
