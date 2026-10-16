package edu.dosw.parcial.model;

import java.util.UUID;

public class SolicitudModel {
    private UUID id;
    private String correo;
    private EstadoSolicitud estado;

    public SolicitudModel(){

    }

    public void setId(UUID id){
        this.id = id;
    }
    public UUID getId(){
        return this.id;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setEstado(EstadoSolicitud estado){
        this.estado = estado;
    }

    public EstadoSolicitud getEstado(){
        return this.estado;
    }
}
