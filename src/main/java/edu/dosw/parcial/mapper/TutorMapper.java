package edu.dosw.parcial.mapper;

import edu.dosw.parcial.model.TutorModel;
import edu.dosw.parcial.entity.Tutor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DisponibilidadMapper.class)
public interface TutorMapper {

    TutorModel toModel(Tutor entity);

    Tutor toEntity(TutorModel model);
}
