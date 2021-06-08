package spring.web.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String number;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
