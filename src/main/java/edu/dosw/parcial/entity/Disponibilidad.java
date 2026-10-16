package edu.dosw.parcial.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.dosw.parcial.model.EstadoDisponibilidad;
import edu.dosw.parcial.model.Modalidad;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Disponibilidad {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NotBlank 
    @Column(nullable = false)
    private LocalDateTime fecha;

    @NotBlank 
    @Column(nullable = false)
    private LocalDateTime horaInicio;

    @NotBlank 
    @Column(nullable = false)
    private LocalDateTime horaFin;

    @NotBlank 
    @Column(nullable = false, length = 100)
    private String lugar;

    @NotBlank 
    @Enumerated(EnumType.STRING)
    private Modalidad modalidad;

    @NotBlank 
    @Enumerated(EnumType.STRING)
    private EstadoDisponibilidad estado;

    @NotBlank
    @Email 
    @Column(nullable = false, length = 200)
    private String correo;

    @NotBlank
    @Email 
    @Column(nullable = false, length = 200)
    private String materia;

    public Disponibilidad(){

    }

    public void setId(UUID id){
        this.id = id;
    }
    public UUID getId(){
        return this.id;
    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }

    public LocalDateTime getFecha(){
        return this.fecha;
    }

    public void setHoraInicio(LocalDateTime inicio){
        this.horaInicio = inicio;
    }

    public LocalDateTime getHoraInicio(){
        return this.horaInicio;
    }

    public void setHoraFin(LocalDateTime fin){
        this.horaFin = fin;
    }

    public LocalDateTime getHoraFin(){
        return this.horaFin;
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    public String getLugar(){
        return this.lugar;
    }

    public void setModalidad(Modalidad modalidad){
        this.modalidad = modalidad;
    }

    public Modalidad getModalidad(){
        return this.modalidad;
    }
    public void setDisponibilidad(EstadoDisponibilidad estado){
        this.estado = estado;
    }

    public EstadoDisponibilidad getEstado(){
        return this.estado;
    }
    
    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return this.materia;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getCorreo(){
        return this.correo;
    }
}
