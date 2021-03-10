package pl.nowak.pawel.healthcenter.service.mapper;

import org.springframework.stereotype.Component;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

@Component
public class DoctorMapper {
    public DoctorEntity from(DoctorModel doctorModel) {
        DoctorEntity doctorEntity = new DoctorEntity();

        return doctorEntity;
    }

    public DoctorModel from(DoctorEntity doctorEntity) {
        DoctorModel doctorModel = new DoctorModel();
        return doctorModel;
    }

}
