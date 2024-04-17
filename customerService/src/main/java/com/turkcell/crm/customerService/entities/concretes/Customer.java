package com.turkcell.crm.customerService.entities.concretes;

import com.turkcell.crm.customerService.core.entities.BaseEntity;
import com.turkcell.crm.customerService.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity<Integer> {
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name ="nationalId")
    private String nationalNumber;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "genders")
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
