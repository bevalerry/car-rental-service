package ru.nikitina.automobility.AutoMobility.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikitina.automobility.AutoMobility.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
