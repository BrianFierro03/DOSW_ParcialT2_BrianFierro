package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Administradores")
public class Administrador extends Usuario{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
}
