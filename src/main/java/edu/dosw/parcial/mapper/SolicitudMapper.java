package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.SolicitudModel;
import edu.dosw.parcial.entity.Solicitud;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SolicitudMapper {

    SolicitudModel toModel(Solicitud entity);

    Solicitud toEntity(SolicitudModel model);
}