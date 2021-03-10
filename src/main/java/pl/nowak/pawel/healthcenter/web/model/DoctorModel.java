package pl.nowak.pawel.healthcenter.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorModel {
    private Long id;
    private String firstName;
    private String lastName;
//    private SpecializationModel specialization;
}
