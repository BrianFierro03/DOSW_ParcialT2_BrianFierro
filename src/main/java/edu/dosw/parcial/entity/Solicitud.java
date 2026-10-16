package edu.dosw.parcial.entity;

import java.util.UUID;

import edu.dosw.parcial.model.EstadoSolicitud;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity 
@Table(name = "Solicitudes")
public class Solicitud {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NotBlank
    @Email 
    @Column(nullable = false, length = 200)
    private String correo;

    @NotBlank 
    @Enumerated(EnumType.STRING)
    private EstadoSolicitud estado;

    public Solicitud(){

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
