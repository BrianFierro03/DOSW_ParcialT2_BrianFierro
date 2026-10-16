package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.DisponibilidadModel;
import edu.dosw.parcial.entity.Disponibilidad;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DisponibilidadMapper {

    DisponibilidadModel toModel(Disponibilidad entity);

    Disponibilidad toEntity(DisponibilidadModel model);
}