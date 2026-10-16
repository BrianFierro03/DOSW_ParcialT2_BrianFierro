package edu.dosw.parcial.model;

import java.util.UUID;
import java.time.LocalDateTime;

public class DisponibilidadModel {
    private UUID id;
    private LocalDateTime fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String lugar;
    private Modalidad modalidad;
    private EstadoDisponibilidad estado;
    private String correo;
    private String materia;

    public DisponibilidadModel(){

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
    public void setEstado(EstadoDisponibilidad estado){
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