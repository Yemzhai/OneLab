package spring.web.app.service;

import spring.web.app.entity.Person;
import spring.web.app.entity.Phone;
import spring.web.app.model.PersonDTO;
import spring.web.app.model.PhoneDTO;

import java.util.List;

public interface PhoneService {
    List<PhoneDTO> getAllPhones();
    PhoneDTO getPhoneById(long id);
    Phone saveNewPhone(Phone phone, long personId);
    Phone updatePhone(long id, Phone phoneDetail);
    void deletePhone(long id);
}
