package pl.nowak.pawel.healthcenter.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

@Component
public class DoctorMapper {
    public DoctorEntity from(DoctorModel doctorModel) {
        ModelMapper modelMapper = new ModelMapper();
        DoctorEntity doctorEntity = modelMapper.map(doctorModel, DoctorEntity.class);

        return doctorEntity;
    }

    public DoctorModel from(DoctorEntity doctorEntity) {
        ModelMapper modelMapper = new ModelMapper();
        DoctorModel doctorModel = modelMapper.map(doctorEntity, DoctorModel.class);
        return doctorModel;
    }

}
