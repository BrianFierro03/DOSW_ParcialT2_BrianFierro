package edu.dosw.parcial.service;

import org.springframework.stereotype.Service;
import edu.dosw.parcial.repository.DisponibilidadRepository;
import edu.dosw.parcial.mapper.DisponibilidadMapper;

@Service 
public class DisponibilidadService {
    private DisponibilidadRepository disponibilidadRepository;
    private DisponibilidadMapper disponibilidadMapper;

    public DisponibilidadService(DisponibilidadRepository disponibilidadRepository, DisponibilidadMapper disponibilidadMapper){
        
    }
}
