package pl.nowak.pawel.healthcenter.service;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.nowak.pawel.healthcenter.core.exception.DoctorNotFoundException;
import pl.nowak.pawel.healthcenter.repository.entity.DoctorEntity;
import pl.nowak.pawel.healthcenter.web.model.DoctorModel;

import static org.junit.jupiter.api.Assertions.*;


class DoctorServiceTest {
    @Test
    void create() {
        //Given
        DoctorService doctorService = new DoctorService();
        DoctorModel doctorModel = new DoctorModel(1L, "Pawel", "Nowak");

        //When
        try {
            doctorService.create(doctorModel);
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

        //Then
        try {
            assertNotNull(doctorService.read(1L), "Repository.get() is null!");
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }
        //TODO: create tests for exceptions
    }

    @Test
    void update() {
        //Given
        DoctorService doctorService = new DoctorService();
        DoctorModel doctor = new DoctorModel(4L, "Pawel", "Nowak");
        DoctorModel updateDoctor = new DoctorModel(null, "John", "Doe");

        try {
            doctorService.create(doctor);
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

        //When
        try {
            doctorService.update(4L, updateDoctor);
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }
        //TODO: create tests for exceptions

        //Then
        assertEquals(doctor.getFirstName(), "John");
        assertEquals(doctor.getLastName(), "Doe");
    }
}