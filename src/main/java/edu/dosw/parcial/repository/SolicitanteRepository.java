package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SolicitanteRepository extends JpaRepository<Solicitante,UUID> {
    
}
