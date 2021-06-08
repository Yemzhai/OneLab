package spring.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spring.web.app.entity.Person;
import spring.web.app.exception.ApiException;
import spring.web.app.exception.NotFoundException;
import spring.web.app.model.PersonDTO;
import spring.web.app.repository.PersonRepository;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonDTO> getAllPeople() {
        return PersonDTO.toModal(personRepository.findAll());
    }

    @Override
    public PersonDTO getPersonById(long id) {
        return PersonDTO.toModal(personRepository.findById(id).orElseThrow(() -> new NotFoundException()));
    }

    @Override
    public Person saveNewPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<PersonDTO> getOlderPeople(int age) {
        return PersonDTO.toModal(personRepository.findByAgeGreaterThan(age));
    }

    @Override
    public Person updatePerson(long id, Person personDetails) {
        Person personUpdate = personRepository.findById(id).orElseThrow(() -> new NotFoundException());
        personUpdate.setName(personDetails.getName());
        personUpdate.setAge(personDetails.getAge());
        personRepository.save(personUpdate);
        return personUpdate;
    }

    @Override
    public void deletePerson(long id) {
        Person personDelete = personRepository.findById(id).orElseThrow(() -> new NotFoundException());
        if (personDelete != null){
            personRepository.deleteById(id);
        }

    }
}
