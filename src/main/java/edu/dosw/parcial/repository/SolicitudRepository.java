package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SolicitudRepository extends JpaRepository<Solicitud,UUID> {
    Optional<Solicitud> findById(UUID id);
    List<Solicitud> findByCorreo(String correo);
}
