package edu.dosw.parcial.repository;

import edu.dosw.parcial.entity.Tutor;
import edu.dosw.parcial.entity.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TutorRepository extends JpaRepository<Tutor,UUID> {
    List<Disponibilidad> findDisponibilidadesById(UUID id);
}

