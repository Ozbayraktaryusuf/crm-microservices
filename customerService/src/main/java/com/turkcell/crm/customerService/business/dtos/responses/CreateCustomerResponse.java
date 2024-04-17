package com.turkcell.crm.customerService.business.dtos.responses;

import com.turkcell.crm.customerService.entities.enums.Gender;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerResponse {
    private int id;
    private LocalDateTime createdDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private String  nationalNumber;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private Gender gender;
}
