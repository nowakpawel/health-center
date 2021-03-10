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
        doctorModel.setLastName("Nowak");

        //When
        DoctorEntity doctorEntity = doctorMapper.from(doctorModel);

        //Then
        assertAll(
                () -> assertNotNull(doctorEntity, "doctorEntity is null!"),
                () -> assertNotNull(doctorEntity.getId(), "doctorEntity.id is null!"),
                () -> assertNotNull(doctorEntity.getFirstName(), "doctorEntity.firstName is null!"),
                () -> assertNotNull(doctorEntity.getLastName(), "doctorEntity.lastName is null!")
        );
    }

    @Test
    void testFrom() {
        //Given
        DoctorMapper doctorMapper = new DoctorMapper();
        DoctorEntity doctorEntity = new DoctorEntity();

        doctorEntity.setId(2L);
        doctorEntity.setFirstName("Pawel");
        doctorEntity.setLastName("Nowak");

        //When
        DoctorModel doctorModel = doctorMapper.from(doctorEntity);

        //Then
        assertAll(
                () -> assertNotNull(doctorModel, "doctorModel is null!"),
                () -> assertNotNull(doctorModel.getId(), "doctorModel.id is null!"),
                () -> assertNotNull(doctorModel.getFirstName(), "doctorModel.firstName is null!"),
                () -> assertNotNull(doctorModel.getLastName(), "doctorModel.lastName is null!")

        );
    }
}