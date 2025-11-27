package ru.nikitina.automobility.AutoMobility.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "horse_powers")
    private int horsePowers;

    private String description;

    private String category;

    private int price;

    private String imageName;

    private boolean isTaken;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

}
