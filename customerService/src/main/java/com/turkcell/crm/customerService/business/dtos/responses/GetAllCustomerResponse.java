package com.turkcell.crm.customerService.business.dtos.responses;

import com.turkcell.crm.customerService.entities.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCustomerResponse {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private String  nationalNumber;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private Gender gender;
}
