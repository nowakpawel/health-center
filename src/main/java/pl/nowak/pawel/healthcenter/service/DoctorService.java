package pl.nowak.pawel.healthcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.nowak.pawel.healthcenter.core.exception.DoctorNotFoundException;
import pl.nowak.pawel.healthcenter.repository.DoctorRepository;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.service.mapper.DoctorMapper;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

import java.util.ArrayList;
import java.util.List;

@Service
//use mapper and repository
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DoctorMapper doctorMapper;

    public List<DoctorModel> list() {
        List<DoctorEntity> entityDoctors = doctorRepository.findAll();
        List<DoctorModel> modelDoctors = new ArrayList<>();

        for (DoctorEntity entity : entityDoctors) {
            DoctorModel doctorModel = doctorMapper.from(entity);
            modelDoctors.add(doctorModel);
        }

        return modelDoctors;
    }

    public DoctorModel create(DoctorModel doctorModel) throws DoctorNotFoundException {
        if (doctorModel == null) {
            throw new DoctorNotFoundException("Doctor is null!");
        }

        //TODO: implement DoctorMapper's methods
        DoctorEntity doctorEntity = doctorMapper.from(doctorModel);
        DoctorEntity createdDoctor = doctorRepository.save(doctorEntity);
        DoctorModel returneDoctor = doctorMapper.from(createdDoctor);

        return returneDoctor;
    }

    public DoctorModel read(Long id) throws DoctorNotFoundException {
        DoctorEntity doctorEntity = doctorRepository.getOne(id);

        return doctorMapper.from(doctorEntity);
    }

    public DoctorModel update(Long id, DoctorModel doctorToUpdate) throws DoctorNotFoundException {
        DoctorEntity doctorEntity = doctorMapper.from(read(id));
        return null;
    }

    public void delete() {

    }
}
