package spring.web.app.service;

import spring.web.app.entity.Person;
import spring.web.app.model.PersonDTO;

import java.util.List;

public interface PersonService {
    List<PersonDTO> getAllPeople();
    PersonDTO getPersonById(long id);
    Person saveNewPerson(Person person);
    List<PersonDTO> getOlderPeople(int age);
    Person updatePerson(long id, Person personDetails);
    void deletePerson(long id);
}
