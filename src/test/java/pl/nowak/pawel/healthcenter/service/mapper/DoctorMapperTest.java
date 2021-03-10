package pl.nowak.pawel.healthcenter.service.mapper;

import org.junit.jupiter.api.Test;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

import static org.junit.jupiter.api.Assertions.*;

class DoctorMapperTest {

    @Test
    void from() {
        //Given
        DoctorMapper doctorMapper = new DoctorMapper();
        DoctorModel doctorModel = new DoctorModel();
        //When
        DoctorEntity doctorEntity = doctorMapper.from(doctorModel);
        //Then
        assertNotNull(doctorEntity, "doctorEntity is null!");
    }

    @Test
    void testFrom() {
        //Given
        //When
        //Then
    }
}