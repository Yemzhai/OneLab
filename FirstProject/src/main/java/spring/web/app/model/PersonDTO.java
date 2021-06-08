package spring.web.app.model;

import lombok.Data;
import spring.web.app.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PersonDTO {
    private long id;
    private String name;
    private int age;
    private List<PhoneDTO> phones;
    public static PersonDTO toModal(Person person){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setAge(person.getAge());
        personDTO.setPhones(person.getPhoneList().stream().map(PhoneDTO::toModal).collect(Collectors.toList()));
        return personDTO;
    }
    public static List<PersonDTO> toModal(List<Person> personList){
        List<PersonDTO> personDTOList;
        personDTOList = personList.stream().map(PersonDTO::toModal).collect(Collectors.toList());
        return personDTOList;
    }
}
