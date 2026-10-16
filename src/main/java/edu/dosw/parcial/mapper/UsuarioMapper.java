package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.UsuarioModel;
import edu.dosw.parcial.entity.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioModel toModel(Usuario entity);

    Usuario toEntity(UsuarioModel model);
}