package pl.nowak.pawel.healthcenter.service.mapper;

import org.junit.jupiter.api.Test;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

import static org.junit.jupiter.api.Assertions.*;

class DoctorMapperTest {

    @Test
    void given_when_then() {
        //Given
        DoctorMapper doctorMapper = new DoctorMapper();
        DoctorModel doctorModel = new DoctorModel();
        doctorModel.setId(1L);
        doctorModel.setFirstName("Pawel");
        //When
        DoctorEntity doctorEntity = doctorMapper.from(doctorModel);
        //Then
        assertAll(
                () -> assertNotNull(doctorEntity, "doctorEntity is null!"),
                () -> assertNotNull(doctorEntity.getId(), "doctorEntity.id is null!"),
                () -> assertNotNull(doctorEntity.getFirstName(), "doctorEntity.firstName is null!")
        );



    }

    @Test
    void testFrom() {
        //Given
        //When
        //Then
    }
}