package spring.web.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Phone> phoneList;
}
