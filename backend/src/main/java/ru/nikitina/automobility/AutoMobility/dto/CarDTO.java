package ru.nikitina.automobility.AutoMobility.dto;

import lombok.Data;

@Data
public class CarDTO {
    private int id;

    private String modelName;

    private int horsePowers;

    private String description;

    private String category;

    private int price;

    private String imageName;

    private boolean isTaken;

    private int personId;

}
