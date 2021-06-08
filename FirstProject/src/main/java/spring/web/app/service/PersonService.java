package spring.web.app.service;

import spring.web.app.entity.Person;
import java.util.List;

public interface PersonService {
    List<Person> getAllPeople();
    Person getPersonById(long id);
    Person saveNewPerson(Person person);
    List<Person> getOlderPeople(int age);
    Person updatePerson(long id, Person personDetails);
    void deletePerson(long id);
}
