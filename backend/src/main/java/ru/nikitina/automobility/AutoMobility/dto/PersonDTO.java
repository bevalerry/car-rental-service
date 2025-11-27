package ru.nikitina.automobility.AutoMobility.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonDTO {

    private String name;

    private String email;

    private String tel;

    private LocalDate dateOfBirth;

    private CarDTO carDTO;

}
