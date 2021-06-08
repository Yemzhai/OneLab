package spring.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.web.app.entity.Person;
import spring.web.app.entity.Phone;
import spring.web.app.model.PersonDTO;
import spring.web.app.model.PhoneDTO;
import spring.web.app.service.PhoneService;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("")
    public List<PhoneDTO> getAllPhones(){
        return phoneService.getAllPhones();
    }
    @GetMapping("/{id}")
    public PhoneDTO getPhoneById(@PathVariable("id") long id){
        return phoneService.getPhoneById(id);
    }
    @PostMapping("/new")
    public Phone createPhone(@RequestBody Phone phone, @RequestParam long personId){
        return phoneService.saveNewPhone(phone, personId);
    }
    @PutMapping("/update/{id}")
    public Phone updatePhone(@PathVariable("id") long id, @RequestBody Phone phone){
        return phoneService.updatePhone(id, phone);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePhoneById(@PathVariable long id){
        phoneService.deletePhone(id);
    }

}
