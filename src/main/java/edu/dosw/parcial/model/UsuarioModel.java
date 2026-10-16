package edu.dosw.parcial.model;

import java.util.UUID;

public abstract class UsuarioModel {
    private UUID id;
    private String correo;

    public UsuarioModel(){

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
}
