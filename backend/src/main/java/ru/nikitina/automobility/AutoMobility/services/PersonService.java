package ru.nikitina.automobility.AutoMobility.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nikitina.automobility.AutoMobility.models.Person;
import ru.nikitina.automobility.AutoMobility.repositories.PersonRepository;
import ru.nikitina.automobility.AutoMobility.util.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findOne(int id) {
        Optional<Person> foundPerson = personRepository.findById(id);
        return foundPerson.orElseThrow(EntityNotFoundException::new);
    }

    public int findPersonsId(String email) {
        return personRepository.findByEmail(email).get().getId();
    }

    public Person update(Person person) {
        return personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }

}

