package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.AdministradorModel;
import edu.dosw.parcial.entity.Administrador;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UsuarioMapper.class)
public interface AdministradorMapper {

    AdministradorModel toModel(Administrador entity);

    Administrador toEntity(AdministradorModel model);
}