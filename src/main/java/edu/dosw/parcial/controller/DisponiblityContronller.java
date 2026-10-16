import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Disponibilidad")
@Tag(name = "Crear disponibilidad", description = "API para la gestión del CRUD de disponibilades")
public class DisponiblityContronller {

    // aca esta la inyección de dependencias para conectar el controlador con la lógica de negocio
    private final DisponibilidadService DisponibilidadService;

    public DisponiblityContronller(DisponibilidadService DisponibilidadService) {
        this.DisponibilidadService = DisponibilidadService;
    }
    /**
     * POST /api/Disponibilidad/login/disponability
     * Crear disponibilidad.
     */
    // aca esta el endpoint POST de Crear disponibilidad
    @PostMapping("/disponability")
    @Operation(summary = "Validar fecha valida", description = "Valida la fecha sea valida para realizar la inscripción como fecha que sea a futuro y creándola con estado LIBRE..")
    public ResponseEntity<?> create(@RequestBody disponabilityModel disponability) {
        Optional<disponabilityModel> nuevo = DisponibilidadService.create(disponability);

        if (nuevo.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevo.get());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(" fecha, hora inicial, hora final, lugar, modalidad (virtual o presencial), correo del tutor y materia,  son obligatorios.");           
}
    /**
     * GET /api/disponiblidad
     */
    // aca esta el endpoint GET que El sistema debe permitir consultar el listado de las disponibilidades registradas.
    @GetMapping
    @Operation(summary = "Listar todos los trabajadores", description = "Obtiene una lista de las disponibilidades registradas en el sistema.")
    public ResponseEntity<List<disponabilityModel>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(DisponibilidadService.findAll());
    }
        /**
     * GET /api/disponiblidad/{id}
     */
    // aca esta el endpoint GET que busca y las disponibilidades por ID
    @GetMapping("/{id}")
    @Operation(summary = "Obtener una disponiblidad por ID", description = "Busca y retorna los detalles una disponabiliad en específico mediante su identificador único.")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<disponabilityModel> user = DisponibilidadService.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(user.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("disponibilidad no encontrada");
    }
    /**
     * GET /api/disponiblidad/login/{id}
     */
    // aca esta el endpoint GET que busca y las disponibilidades iniciando sesión y que me aprezca a mí
    @GetMapping("/{id}")
    @Operation(summary = "Obtener una disponiblidad por ID", description = "Busca y retorna los detalles una disponabiliad en específico mediante su identificador único.")
    public ResponseEntity<?> getMy(@PathVariable Long id) {
        Optional<disponabilityModel> user = DisponibilidadService.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(user.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("disponibilidad no encontrada");
    }
    @PutMapping("/{id}")
    @Operation(summary = "Actualizar la información de una disponibilidad", description = "Modifica los datos de una disponibilidad existente.")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody disponabilityModel disponabilityData) {
        Optional<disponabilityModel> existente = DisponibilidadService.findById(id);

        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Disponibilidad no encontrada");
        }

        Optional<disponabilityModel> actualizado = DisponibilidadService.update(id,disponabilityData);

        if (actualizado.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(actualizado.get());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(" fecha, hora inicial, hora final, lugar, modalidad (virtual o presencial), correo del tutor y materia,  son obligatorios.");           
    }

    
}