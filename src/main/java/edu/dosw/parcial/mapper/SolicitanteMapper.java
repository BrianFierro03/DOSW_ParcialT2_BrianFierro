package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.SolicitanteModel;
import edu.dosw.parcial.entity.Solicitante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UsuarioMapper.class)
public interface SolicitanteMapper {

    SolicitanteModel toModel(Solicitante entity);

    Solicitante toEntity(SolicitanteModel model);
}
