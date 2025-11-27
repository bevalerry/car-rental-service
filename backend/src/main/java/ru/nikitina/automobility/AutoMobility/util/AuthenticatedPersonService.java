package ru.nikitina.automobility.AutoMobility.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.nikitina.automobility.AutoMobility.models.Person;
import ru.nikitina.automobility.AutoMobility.security.PersonDetails;

@Service
public class AuthenticatedPersonService {
    public Person getAuthenticatedPerson() {
        PersonDetails personDetails = (PersonDetails) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        return personDetails.getPerson();
    }
}
