package edu.dosw.parcial.entity;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "Solicitantes")
public class Solicitante extends Usuario{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
}
