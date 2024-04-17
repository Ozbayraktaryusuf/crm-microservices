package com.turkcell.crm.customerService.business.dtos.requests;

import com.turkcell.crm.customerService.entities.enums.Gender;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCustomerRequest {
    @NotNull
    @Size(min = 1)
    private String firstName;
    @Size(min = 1)
    private String middleName;
    @NotNull
    @Size(min = 1)
    private String lastName;
    @NotNull
    private LocalDate birthDate;
    @Size(min = 1)
    private String motherName;
    @Size(min = 1)
    private String fatherName;
    @NotNull
    private Gender gender;
}
