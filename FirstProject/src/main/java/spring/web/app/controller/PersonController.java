package spring.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.web.app.model.PersonDTO;
import spring.web.app.service.PersonService;
import spring.web.app.entity.Person;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public PersonDTO findPersonById(@PathVariable("id") long id){
        return personService.getPersonById(id);
    }

    @GetMapping("")
    public List<PersonDTO> getAllPeople(){
        return personService.getAllPeople();
    }
    @GetMapping("per/{id}")
    public PersonDTO getPersonById(@PathVariable("id") long id){
        return personService.getPersonById(id);
    }
    @PostMapping("/new")
    public Person createPerson(@RequestBody Person person){
        return personService.saveNewPerson(person);
    }
    @GetMapping("/older-than/{age}")
    public List<PersonDTO> getPeopleByAge(@PathVariable("age") int age){
        return personService.getOlderPeople(age);
    }
    @PutMapping("/update/{id}")
    public Person updatePerson(@PathVariable("id") long id, @RequestBody Person person){
        return personService.updatePerson(id, person);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable long id){
        personService.deletePerson(id);
    }
}
