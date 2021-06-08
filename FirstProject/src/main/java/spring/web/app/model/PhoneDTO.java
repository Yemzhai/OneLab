package spring.web.app.model;

import lombok.Data;
import spring.web.app.entity.Person;
import spring.web.app.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PhoneDTO {
    private long id;
    private String number;
    public static PhoneDTO toModal(Phone phone){
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setId(phone.getId());
        phoneDTO.setNumber(phone.getNumber());
        return phoneDTO;
    }
    public static List<PhoneDTO> toModal(List<Phone> phoneList){
        List<PhoneDTO> phoneDTOList;
        phoneDTOList = phoneList.stream().map(PhoneDTO::toModal).collect(Collectors.toList());
        return phoneDTOList;
    }
}
