package spring.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.web.app.entity.Person;
import spring.web.app.entity.Phone;
import spring.web.app.exception.NotFoundException;
import spring.web.app.model.PersonDTO;
import spring.web.app.model.PhoneDTO;
import spring.web.app.repository.PersonRepository;
import spring.web.app.repository.PhoneRepository;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PhoneDTO> getAllPhones() {
        return PhoneDTO.toModal(phoneRepository.findAll());
    }

    @Override
    public PhoneDTO getPhoneById(long id) {
        return PhoneDTO.toModal(phoneRepository.findById(id).orElseThrow(() -> new NotFoundException()));
    }

    @Override
    public Phone saveNewPhone(Phone phone, long personId) {
        Person person = personRepository.findById(personId).orElseThrow(() -> new NotFoundException());
        phone.setPerson(person);
        return phoneRepository.save(phone);
    }

    @Override
    public Phone updatePhone(long id, Phone phoneDetail) {
        Phone phoneUpdate = phoneRepository.findById(id).orElseThrow(() -> new NotFoundException());
        phoneUpdate.setNumber(phoneDetail.getNumber());
        phoneUpdate.setPerson(phoneDetail.getPerson());
        phoneRepository.save(phoneUpdate);
        return phoneUpdate;
    }

    @Override
    public void deletePhone(long id) {
        Phone phoneDelete = phoneRepository.findById(id).orElseThrow(() -> new NotFoundException());
        if (phoneDelete != null){
            phoneRepository.deleteById(id);
        }
    }
}
